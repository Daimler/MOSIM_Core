// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "MCollisionDetectionService.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using namespace  ::MMIStandard;

class MCollisionDetectionServiceHandler : virtual public MCollisionDetectionServiceIf {
 public:
  MCollisionDetectionServiceHandler() {
    // Your initialization goes here
  }

  void ComputePenetration( ::MMIStandard::MVector3& _return, const  ::MMIStandard::MCollider& colliderA, const  ::MMIStandard::MTransform& transformA, const  ::MMIStandard::MCollider& colliderB, const  ::MMIStandard::MTransform& transformB) {
    // Your implementation goes here
    printf("ComputePenetration\n");
  }

  bool CausesCollision(const  ::MMIStandard::MCollider& colliderA, const  ::MMIStandard::MTransform& transformA, const  ::MMIStandard::MCollider& colliderB, const  ::MMIStandard::MTransform& transformB) {
    // Your implementation goes here
    printf("CausesCollision\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  ::std::shared_ptr<MCollisionDetectionServiceHandler> handler(new MCollisionDetectionServiceHandler());
  ::std::shared_ptr<TProcessor> processor(new MCollisionDetectionServiceProcessor(handler));
  ::std::shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  ::std::shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  ::std::shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

