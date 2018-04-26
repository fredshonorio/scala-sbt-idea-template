package myproject

import org.scalatest.FunSuite

class HiTest extends FunSuite {
  test("testSay") {
    assert(Hi.say() == "hi")
  }
}
