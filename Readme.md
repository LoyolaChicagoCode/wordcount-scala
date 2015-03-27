## Word Counting Project



### Learning Objectives
* transition from Java to Scala
* An understanding of imperative and pure functional paradigms
* higher-order functions
* immutable and mutable data structures
* test-driven development (TDD) in Scala and Intellij IDEA

### Functional Requirements
Your job is to read an arbitrary number of words from the standard input and keep track how many times each word occurs in the input. After the end of the input is reached, print how many times each unique word has occurred (in no particular word order or numerical order).

For example, if the input is

```
hello hello
    world goodbye hello
  world
```

then one possible output is

```
world 2
goodbye 1
hello 3
```

If the input is empty, so is the output.

Your program should read the standard input (stdin) until EOF (^D on Unix including Linux and Mac OS, ^Z on Windows) and must support redirection at the shell level.

### Nonfunctional Requirements
<b>Static</b>

* language: Scala
* build tool: SBT
* test framework: ScalaTest
* use mutable variables and data structures as you see fit
* testability: for full credit, modularize your program in such a way that you can drive the main word counting functionality from both an application and test cases and your test cases do not have to look at unstructured output
* test coverage: for full credit, provide a test suite that
* includes a range of cases including boundary cases
* has modular code that minimizes repetition (DRY principle)
* maintainability: follow good style and design principles

<b>Dynamic</b>
* scalability: for full credit, make sure your program works with arbitrarily large input (assuming the number of distinct words is reasonably small)
