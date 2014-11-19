package models.testgen

import java.io.File
import jp.co.flect.io.FileUtils

trait MochaTestGenerator extends SourceGenerator {

  override def generateTest(dir: File, name: String, desc: String, messages: Seq[MessageWrapper]): File = {
    val text = views.txt.mochaTest(desc, messages).toString
    val ret = new File(dir, name + ".js")
    FileUtils.writeFile(ret, text, "utf-8")
    ret
  }
}

