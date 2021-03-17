#!/bin/bash
java -jar "javadoc-generator.jar" com.loamen.App -source "com.loamen.javadoctest" -subpackages "com.loamen.javadoctest" -sourcepath "..\..\javadoc-test\src\main\java" -classpath "..\..\javadoc-test\target\classes" -fieldmodifier PUBLIC -methodmodifier PUBLIC -docpath "/home/doc.docx"
pause
