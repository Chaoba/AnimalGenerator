const fs = require('fs');
const path = require('path');

global.writeIfModified = function (filename, newContent) {
  try {
    const oldContent = fs.readFileSync(filename, 'utf8');
    if (oldContent == newContent) {
      console.warn(`* Skipping file '${filename}' because it is up-to-date`);
      return;
    }
  } catch (err) {
  }
  if (['0', 'false'].indexOf(process.env.DRY_RUN || '0') !== -1) {
    fs.writeFileSync(filename, newContent);
  }
  console.warn(`* Updating outdated file '${filename}'`);
};