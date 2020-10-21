#!/bin/bash

echo "$USER program"

mkdir Erik_Blidner_labb

cp -R *.java "Erik_Blidner_labb"

cd Erik_Blidner_labb

pwd

echo "Compiling..." 

javac GuessingGame.java

echo "Running game..."

java GuessingGame

echo "Done"

echo "Removing class files..."

rm *.class

ls