## Singleton Design pattern
1. if we need single instance of a class we use this pattern
2. eg. Database connection, config manager, file etc.

### when
1. If we need single instance of a class

### why
1. If we don't use singleton there might be multiple instance of a class which will create ambiguity. Let's say db connection conn1 and conn2 which point to same db. Now there can be inconsisten data
eg. conn1 added 1, conn2 added 3, conn1 now reading the same value
2. This maintain single global instance


### How
1. There are multiple initialization added in Singleton.java file
2. Make constructor private
3. public static method to getInstance