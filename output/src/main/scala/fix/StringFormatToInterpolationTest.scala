package fix

class StringFormatToInterpolationTest {
  "a b c".format(9)

  s" ${2} a1 ${Nil} a2 ${false} a3"

  s"${2}${"x"}"

  s"${9}${8}${7}a"

  s"${5} x ${true}"

  s"${Some(9)}"

  s"a ${Some(7)}"

  s"${Some(4)} b"

  "%s %s %s".format(1, None)
}