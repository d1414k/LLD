## Factory Design pattern

### when
1. In order to decouple between client and library
2. In this pattern client will interact with factory not actual class to create object

### why
1. If we don't use this pattern wheneven there is change in library ie Anminal call client also need to modify their code

### How
1. Create a factory class which will create different types of object depending on types at runtime

