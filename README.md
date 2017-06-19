**[Kotlin support has been integrated directly in reactor-core](https://github.com/reactor/reactor-core/commit/5140235171ddd84a83c761a6868aa55fa2036fbd), as a consequence this repository will be removed when Reactor 3.1.0.RELEASE will be released.**

# Kotlin extensions for Reactor

This library exposes a set of Kotlin [extensions](https://kotlinlang.org/docs/reference/extensions.html)
that allow a more idiomatic Kotlin usage of [Reactor](https://projectreactor.io/) APIs.

## Usage


| Java                                         | Kotlin with extensions               |
| -------------------------------------------- | ------------------------------------ |
| `Mono.just("foo")`                           | `"foo".toMono()`                     |
| `Flux.fromIterable(list)`                    | `list.toFlux()`                      |
| `Mono.error(new RuntimeException())`         | `RuntimeException().toMono()`        |
| `Flux.error(new RuntimeException())`         | `RuntimeException().toFlux()`        |
| `flux.ofType(Foo.class)`                     | `flux.ofType<Foo>()` or `flux.ofType(Foo::class)` |
| `StepVerifier.create(flux).verifyComplete()` | `flux.test().verifyComplete()`       |

Check [API documentation](https://repo.spring.io/milestone/io/projectreactor/reactor-kotlin-extensions/1.0.0.M1/reactor-kotlin-extensions-1.0.0.M1-javadoc.jar!/reactor-kotlin-extensions/index.html) for the full list of extensions.

See these unit tests for more code examples:
 - [Flux extensions](https://github.com/reactor/reactor-kotlin-extensions/blob/master/src/test/kotlin/reactor/core/publisher/FluxExtensionsTests.kt)
 - [Mono extensions](https://github.com/reactor/reactor-kotlin-extensions/blob/master/src/test/kotlin/reactor/core/publisher/MonoExtensionsTests.kt)
 - [StepVerifier extensions](https://github.com/reactor/reactor-kotlin-extensions/blob/master/src/test/kotlin/reactor/test/StepVerifierExtensionsTests.kt)
 - [Tuple extensions](https://github.com/reactor/reactor-kotlin-extensions/blob/master/src/test/kotlin/reactor/util/function/TupleExtensionsTests.kt)


## Dependency

### Release

- Repository: `https://repo.spring.io/milestone`
- Artifact: `io.projectreactor:reactor-kotlin-extensions:1.0.0.M2`

### Snapshot

- Repository: `https://repo.spring.io/snapshot`
- Artifact: `io.projectreactor:reactor-kotlin-extensions:1.0.0.BUILD-SNAPSHOT`

## About

Some extensions are inspired from [RxKotlin](https://github.com/ReactiveX/RxKotlin).

This project is Apache 2.0 licensed.
