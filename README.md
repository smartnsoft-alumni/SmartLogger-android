# SmartLogger

A component which allows to tweak log usage

## Usage

### Gradle

Library releases are available on Bintray / JCenter

**Gradle**

```groovy
implementation 'com.smartnsoft:logger:1.0.0'
```

### Implementation

Simplest implementation :

```kotlin
// Manual tag
val log: Logger = LoggerFactory.getInstance("YourTag")
```

If you want the logger to use the enclosing class name as the tag:

```kotlin
// Automatic tag via class name
val log: Logger = LoggerFactory.getInstance(this.javaClass)
```

If you want to tweak which log level you want:

```kotlin
// Automatic tag via class name
protected val log: Logger = LoggerFactory.getInstance(this.javaClass, Log.WARN)

// Or later in the code:
log.logLevel = Log.WARN
```

If no log level are given when creating a *Logger*, it will use the one provided in the *LoggerFactory* by default which is *Log.WARN*


## Author

The Android Team @Smart&Soft, software agency http://www.smartnsoft.com

## License

SmartLogger is available under the MIT license. See the LICENSE file for more info.
