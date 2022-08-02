package com.rmendes

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration.DurationIn

class HelloSimulation extends Simulation {
    val helloTest = scenario("Hello Scenario").exec(karateFeature("classpath:com/rmendes/simple.feature@name=simple"))

    val protocol =karateProtocol(
        "/" -> pauseFor("get" -> 2)
    )

    setUp(
        helloTest.inject(rampUsers(20) during (1 minute)).protocols(protocol)
    )
}