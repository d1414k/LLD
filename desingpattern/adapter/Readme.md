## Adapter design pattern
1. This is a structural design pattern


### when
1. When we have two incompatiable class but we need to call one using other
2. We use adapter in between inorder to convert one to other
3. Example USB C to B type adapter

### why
1. If we don't use this pattern we won't be able to use existing method eg. lets say we have a library method which analyses json data, now we have requirement to anlyse xml data,
2. So we need adapter which convert xml to json and call same analyse method of library

### How
1. Create a adpater class which implement the same interface with which this class is incompatible (eg. Student)
2. Add dependency of this class in adpater class
3. Implement all the interface methods using this dependency
4. Now use this adapter where ever we need this call