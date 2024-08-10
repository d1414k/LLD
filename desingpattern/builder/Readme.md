## Builder design pattern
1. It's creational design pattern
2. This is used to create a complex object step by step

### when
1. If we have a complex object to initialize eg. House, Computer

### why
1. If we don't use builder pattern we might need to write multiple constructors


### How
1. Create a class with all private fields eg. House
2. Define private constructor which takes Builder instance eg. HouseBuilder as input and initialise all the fields
3. Create a nested static class Builder eg. HouseBuilder with similar fields
4. Define all public setter methods
5. Define public build method which will call House's constructor and return this object.

### Logic
1. We are making House class as immutable inorder to make it thread safe
2. We are making constructor private so that no one from outside can create it, one must need to use HouseBuilder

