/*
rule = CirceCodec
 */
package fix

import io.circe.generic.JsonCodec

@JsonCodec
case class CirceCodecTest1(a: Int)

@JsonCodec
case class CirceCodecTest2(a: String)

object CirceCodecTest2 {
  def foo = 2
}
