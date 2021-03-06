// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "MMIServiceBase.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using namespace  ::MMIStandard;

class MMIServiceBaseHandler : virtual public MMIServiceBaseIf {
 public:
  MMIServiceBaseHandler() {
    // Your initialization goes here
  }

  void GetStatus(std::map<std::string, std::string> & _return) {
    // Your implementation goes here
    printf("GetStatus\n");
  }

  void GetDescription( ::MMIStandard::MServiceDescription& _return) {
    // Your implementation goes here
    printf("GetDescription\n");
  }

  void Setup( ::MMIStandard::MBoolResponse& _return, const  ::MMIStandard::MAvatarDescription& avatar, const std::map<std::string, std::string> & properties) {
    // Your implementation goes here
    printf("Setup\n");
  }

  void Consume(std::map<std::string, std::string> & _return, const std::map<std::string, std::string> & properties) {
    // Your implementation goes here
    printf("Consume\n");
  }

  void Dispose( ::MMIStandard::MBoolResponse& _return, const std::map<std::string, std::string> & properties) {
    // Your implementation goes here
    printf("Dispose\n");
  }

  void Restart( ::MMIStandard::MBoolResponse& _return, const std::map<std::string, std::string> & properties) {
    // Your implementation goes here
    printf("Restart\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  ::std::shared_ptr<MMIServiceBaseHandler> handler(new MMIServiceBaseHandler());
  ::std::shared_ptr<TProcessor> processor(new MMIServiceBaseProcessor(handler));
  ::std::shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  ::std::shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  ::std::shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

