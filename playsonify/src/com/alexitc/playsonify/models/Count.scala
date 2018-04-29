package com.alexitc.playsonify.models

import play.api.libs.json.{JsNumber, Writes}

case class Count(int: Int) extends AnyVal

object Count {

  implicit val writes: Writes[Count] = Writes[Count] { count => JsNumber(count.int) }
}
