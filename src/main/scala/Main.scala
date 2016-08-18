import java.net.InetSocketAddress

import akka.actor.ActorSystem
/**
  * @author keen
  * @since 18/8/16.
  */
object MainApp extends  App{

  val system = ActorSystem("echo-service-system")
  val endpoint = new InetSocketAddress("localhost", 9000)
  system.actorOf(EchoService.props(endpoint, system), "echo-service")

  scala.io.StdIn.readLine(s"Hit ENTER to exit ...${System.getProperty("line.separator")}")
  system.shutdown()


}
