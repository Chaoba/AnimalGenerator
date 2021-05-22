#!/usr/bin/env node
'use strict';

const fs = require('fs');
const ejs = require('ejs');
require('./utils');

const animalCollections = require('./animals.json');

const animalKotlin = ejs.compile(fs.readFileSync('./Animal.ejs', 'utf8'), {strict: true});
for (const animal of animalCollections.animals) {
    writeIfModified(`./generated/${animal.name}.kt`, animalKotlin(animal));
}

