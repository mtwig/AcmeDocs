# Style guide
This is a page defines general purpose style guides.

## Javadoc
All publicly available classes and methods should have Javadoc included.

## Classes
Prefer immutable objects whenever possible.

## Lombok
Use Lombok to generate getters, setters, and builders.

## Self documentation
While Javadoc is to be written, attempt to make it unnecessary.

A client of a library should not have to open Javadoc to understand the purpose of a class, or method. It should be self-evident based on the name. Javadoc can be used to clarify some non-obvious behaviours, such as Exceptions.