package impl;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import api.BarService;

import akka.stream.javadsl.Source;

public class BarServiceImpl implements BarService {

  @Override
  public ServiceCall<NotUsed, NotUsed, String> bar() {
    return (id, request) -> {
      return CompletableFuture.completedFuture("Greetings from bar service");
    };
  }
}
