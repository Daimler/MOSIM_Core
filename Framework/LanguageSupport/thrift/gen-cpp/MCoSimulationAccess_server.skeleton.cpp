// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "MCoSimulationAccess.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using namespace  ::MMIStandard;

class MCoSimulationAccessHandler : virtual public MCoSimulationAccessIf {
 public:
  MCoSimulationAccessHandler() {
    // Your initialization goes here
  }

  void RegisterAtEvent( ::MMIStandard::MBoolResponse& _return, const  ::MMIStandard::MIPAddress& clientAddress, const std::string& eventType) {
    // Your implementation goes here
    printf("RegisterAtEvent\n");
  }

  void UnregisterAtEvent( ::MMIStandard::MBoolResponse& _return, const  ::MMIStandard::MIPAddress& clientAddress, const std::string& eventType) {
    // Your implementation goes here
    printf("UnregisterAtEvent\n");
  }

  void AssignInstruction( ::MMIStandard::MBoolResponse& _return, const  ::MMIStandard::MInstruction& instruction, const std::map<std::string, std::string> & properties) {
    // Your implementation goes here
    printf("AssignInstruction\n");
  }

  void Abort( ::MMIStandard::MBoolResponse& _return) {
    // Your implementation goes here
    printf("Abort\n");
  }

  void AbortInstruction( ::MMIStandard::MBoolResponse& _return, const std::string& instructionID) {
    // Your implementation goes here
    printf("AbortInstruction\n");
  }

  void AbortInstructions( ::MMIStandard::MBoolResponse& _return, const std::vector<std::string> & instructionIDs) {
    // Your implementation goes here
    printf("AbortInstructions\n");
  }

  void GetHistoryFromTime(std::vector<MCoSimulationEvents> & _return, const double startTime, const double endTime, const std::string& eventType) {
    // Your implementation goes here
    printf("GetHistoryFromTime\n");
  }

  void GetHistoryFromFrames(std::vector<MCoSimulationEvents> & _return, const int32_t fromFrame, const int32_t toFrame, const std::string& eventType) {
    // Your implementation goes here
    printf("GetHistoryFromFrames\n");
  }

  void GetHistory(std::vector<MCoSimulationEvents> & _return, const std::string& eventType) {
    // Your implementation goes here
    printf("GetHistory\n");
  }

  void GetCurrentEvents(MCoSimulationEvents& _return) {
    // Your implementation goes here
    printf("GetCurrentEvents\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  ::std::shared_ptr<MCoSimulationAccessHandler> handler(new MCoSimulationAccessHandler());
  ::std::shared_ptr<TProcessor> processor(new MCoSimulationAccessProcessor(handler));
  ::std::shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  ::std::shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  ::std::shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

