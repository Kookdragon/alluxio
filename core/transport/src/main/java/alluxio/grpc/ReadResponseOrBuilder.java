// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: block_worker.proto

package alluxio.grpc;

public interface ReadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.ReadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.Chunk chunk = 1;</code>
   */
  boolean hasChunk();
  /**
   * <code>optional .alluxio.grpc.Chunk chunk = 1;</code>
   */
  alluxio.grpc.Chunk getChunk();
  /**
   * <code>optional .alluxio.grpc.Chunk chunk = 1;</code>
   */
  alluxio.grpc.ChunkOrBuilder getChunkOrBuilder();
}
