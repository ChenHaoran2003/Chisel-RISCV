package decode

import chiseltest._
import org.scalatest._

class HexTest extends FlatSpec with ChiselScalatestTester {
  "mycpu" should "work through hex" in {
    test(new Top) { c =>
      while(!c.io.exit.peek().litToBoolean) {
        c.clock.step(1)
      }
    }
  }
}
