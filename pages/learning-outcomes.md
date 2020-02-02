---
title: "Learning outcomes"
---

**Learning outcomes** are designed to assess student mastery in a course.

## Coding style
### CSCI-160-CS-BR-1
**Objective:** Assess student's ability to consistently place curly braces '{'
'}' in Java code.  
**Justification:** Improves code readability.

### CSCI-160-CS-IN-1
**Objective:** Assess student's ability to correctly indent Java code.  
**Justification:** Rule #5 (The Elements of Java Style).

### CSCI-160-CS-JD-1
**Objective:** Assess student's understanding of JavaDoc comments. Students are
expected to provide JavaDoc style comments for all classes, methods, and fields.  
**Justification:** Rules #32, #53 (The Elements of Java Style).

### CSCI-160-CS-NC-1
**Objective:** Assess student's understanding of Java naming conventions.
Students are expected to use _PascalCase_ for classes and _camelCase_ for
methods and variables.  
**Justification:** Rules #22, #25 (The Elements of Java Style).

### CSCI-160-CS-NC-2
**Objective:** Assess student's understanding of advanced naming convention
topics. Currently considered is the use of _ALL\_CAPITAL_ letters, combined with
underscores, for constant values.  
**Justification:** Rule #31 (The Elements of Java Style).

### CSCI-160-CS-NC-3
**Objective:** Assess student's ability and willingness to identify meaningful
names for classes, methods, and variables.  
**Justification:** Rule #9 (The Elements of Java Style).

### CSCI-160-CS-VS-1
**Objective:** Assess student's understanding of variable scope. Students are
expected to minimize variable scope, i.e., declare variables only within the
scope in which they are required. The two scopes considered as part of this
outcome are _class-level_ and _method-level_.  
**Justification:** Minimizing variable scope makes it much easier for someone
looking at the code to identify the datatype for said variables. It can also be
helpful for determining the semantic value of the variable, i.e., what it is
used for. Conversely, declaring variables in scopes where the are not needed
pollutes the name space, i.e., reduces the potential set of variable identifiers
from which one can choose.

### CSCI-160-CS-VS-2
**Objective:** Assess student's understanding of advanced variable scope. This
objective considers _block-level_ scope in addition to those considered in
[CS160-CS-VS-1](#cs160-cs-vs-1).  
**Justification:** Same as [CSCI-160-CS-VS-1](#csci-160-cs-vs-1).

## Programming concepts
### CSCI-160-PC-FC-1
**Objective:** Assess student's understanding of the if-else-if ladder.  
**Justification:** Explicitly specifying the default condition in a final
else-if clause can mask errors should any of the prior conditions change. By
using an else clause as the final clause in an if-else-if ladder, it ensures
that every possible input will be captured by some branch.

### CSCI-160-PC-FC-2
**Objective:** Assess student's ability to correctly discriminate between the
appropriate loop construct for a particular circumstance. Specifically, there is
an expectation that the student prefer the _for_ construct over the _while_
construct whenever reasonable.  
**Justification:** The _for_ construct presents all of the information that
dictates the lifetime of the loop in a single place. By looking at a _for_
statement, one can immediately tell what variable is controlling the loop, what
its starting value is, how it changes, and when the loop will end. Because of
this, it often leads to shorter and more understandable code. Rule #12.5 (The
Elements of C Programming Style).
