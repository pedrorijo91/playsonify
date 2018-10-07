package controllers.common

import com.alexitc.playsonify.models.{ErrorId, ServerError}
import com.alexitc.playsonify.play.AbstractJsonController
import org.slf4j.LoggerFactory

abstract class MyJsonController(components: MyJsonControllerComponents) extends AbstractJsonController(components) {

  protected val logger = LoggerFactory.getLogger(this.getClass)

  override protected def onServerError(error: ServerError, errorId: ErrorId): Unit = {
    logger.error(s"Unexpected internal error = ${errorId.string}", error.cause)
  }
}
