package net.devh.examples.grpc.lib;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: helloworld.proto")
public class SimpleGrpc {

  private SimpleGrpc() {}

  public static final String SERVICE_NAME = "Simple";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<net.devh.examples.grpc.lib.HelloRequest,
      net.devh.examples.grpc.lib.HelloReply> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Simple", "SayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(net.devh.examples.grpc.lib.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(net.devh.examples.grpc.lib.HelloReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleStub newStub(io.grpc.Channel channel) {
    return new SimpleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SimpleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SimpleFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class SimpleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(net.devh.examples.grpc.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<net.devh.examples.grpc.lib.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                net.devh.examples.grpc.lib.HelloRequest,
                net.devh.examples.grpc.lib.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class SimpleStub extends io.grpc.stub.AbstractStub<SimpleStub> {
    private SimpleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(net.devh.examples.grpc.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<net.devh.examples.grpc.lib.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class SimpleBlockingStub extends io.grpc.stub.AbstractStub<SimpleBlockingStub> {
    private SimpleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public net.devh.examples.grpc.lib.HelloReply sayHello(net.devh.examples.grpc.lib.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class SimpleFutureStub extends io.grpc.stub.AbstractStub<SimpleFutureStub> {
    private SimpleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.examples.grpc.lib.HelloReply> sayHello(
        net.devh.examples.grpc.lib.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SimpleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((net.devh.examples.grpc.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<net.devh.examples.grpc.lib.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SAY_HELLO);
  }

}
