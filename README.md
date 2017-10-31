# kotlin-stuff
In this repo you will find:
 * kotlin exercises from http://exercism.io/
 * basic kotlin code
 * some things I'm trying

## How to install on Linux, I think mack too
```
$ curl -s https://get.sdkman.io | bash
$ bash
$ sdk install kotlin
```

## How to compile to JAR

```
kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar
```

Then to execute:
```
java -jar HelloWorld.jar
```

## Compile to bytecode

```
kotlinc HelloWorld.kt
```
Then to run:

```
javap -c HelloWorldKt.class
```
