import reactor.core.publisher.Mono
import java.util.concurrent.Callable
import java.util.concurrent.CompletableFuture

fun <T> T.toMono(): Mono<T> = Mono.just(this)
fun <T> CompletableFuture<T>.toMono(): Mono<T> = Mono.fromFuture(this)
fun <T> Callable<T>.toMono(): Mono<T> = Mono.fromCallable { this.call() }
fun <T> Throwable.toMono(): Mono<T> = Mono.error(this)