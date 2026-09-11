Director runs the same set of steps (setCPU, setGPU, setRAM, etc.) on whatever Builder it's given, without knowing or caring what that builder actually is.

- Pass in an ObjectBuilder and those steps quietly fill in fields that later become a Product object; 
- Pass in a TextBuilder and the exact same steps instead append lines to a string. 

So one recipe (Director), two different builders, two completely different results — an object or a spec sheet — with zero changes to Director itself.
