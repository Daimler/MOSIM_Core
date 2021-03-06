// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "MRetargetingService.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using namespace  ::MMIStandard;

class MRetargetingServiceHandler : virtual public MRetargetingServiceIf {
 public:
  MRetargetingServiceHandler() {
    // Your initialization goes here
  }

  void SetupRetargeting( ::MMIStandard::MAvatarDescription& _return, const  ::MMIStandard::MAvatarPosture& globalTarget) {
    // Your implementation goes here
    printf("SetupRetargeting\n");
  }

  void RetargetToIntermediate( ::MMIStandard::MAvatarPostureValues& _return, const  ::MMIStandard::MAvatarPosture& globalTarget) {
    // Your implementation goes here
    printf("RetargetToIntermediate\n");
  }

  void RetargetToTarget( ::MMIStandard::MAvatarPosture& _return, const  ::MMIStandard::MAvatarPostureValues& intermediatePostureValues) {
    // Your implementation goes here
    printf("RetargetToTarget\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  ::std::shared_ptr<MRetargetingServiceHandler> handler(new MRetargetingServiceHandler());
  ::std::shared_ptr<TProcessor> processor(new MRetargetingServiceProcessor(handler));
  ::std::shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  ::std::shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  ::std::shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

