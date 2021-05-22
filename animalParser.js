#!/usr/bin/env node
'use strict';

const fs = require('fs');
const ejs = require('ejs');
require('./utils');

const animalCollections = require('./animals.json');

const animalKotlin = ejs.compile(fs.readFileSync('./Animal.ejs', 'utf8'), {strict: true});
const animalType = ejs.compile(fs.readFileSync('./AnimalType.ejs', 'utf8'), {strict: true});

for (const type of animalCollections.types) {
        writeIfModified(`./generated/types/${type}.kt`, animalType(type));
}

for (const animal of animalCollections.animals) {
    writeIfModified(`./generated/${animal.name}.kt`, animalKotlin(animal));
}

