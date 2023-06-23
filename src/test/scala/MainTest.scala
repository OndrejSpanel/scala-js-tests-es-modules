import org.scalatest.funsuite.AnyFunSuite

import io.scalajs.nodejs.fs._
import io.scalajs.nodejs.path._

class MainTest extends AnyFunSuite {
  test("Test something") {
    val content = Fs.readFileSync("build.sbt").toString("utf8")
    assert(content.contains("ThisBuild"))
  }

}
