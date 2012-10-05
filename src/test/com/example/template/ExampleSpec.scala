package com.example.template

import org.specs2.Specification
import org.specs2.runner.JUnitRunner // 忘れないこと
import org.junit.runner.RunWith // 忘れないこと

@RunWith(classOf[JUnitRunner]) // 忘れないこと
class ExampleSpec extends Specification { def is =
    "Exampleの確認"                             ^
      "引数が \"Hello\" の場合は5を返す"        ! context().e1^
      "引数が \"漢字の文字数\" の場合は6を返す" ! context().e2^
                                                end

    case class context() {
        val example = new Example;
        def e1 = example.countString("Hello") must_== 5
        def e2 = example.countString("漢字の文字数") must_== 6
    }
}
// vim: set ts=4 sw=4 et:
