/* Comment */
include "other.thrift"

namespace cpp tutorial
namespace java tutorial

typedef i32 MyInteger

# Comment
const i32 MAGIC_NUMBER = 42
const map<string,byte> MAPCONSTANT = {'one':1, 'two':2}

// Comment
enum SomeEnum {
  ONE   = 1,  TWO   = 2,
  THREE = 3,  FOUR  = 4
}

struct SomeStruct {
  1: i32 num  = 0,
  3: SomeEnum evalue,
  4: optional string comment
}

exception SomeException 
{
  1: i32 where,
  2: string message
}

service MyService extends other.MyOtherService 
{
   void do_some_work(1:SomeEnum id, 2:SomeStruct s) throws (1:SomeException ouch),
   oneway void doitoneway()
}
