package com.testevolve.event

import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.session.event.SessionCreatedEvent
import io.micronaut.session.event.SessionDeletedEvent
import io.micronaut.session.event.SessionDestroyedEvent
import io.micronaut.session.event.SessionExpiredEvent
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory

@Singleton
class SessionEventListener {
    companion object {
        private val logger = LoggerFactory.getLogger(SessionEventListener::class.java)
    }

    @EventListener
    fun onSessionCreated(event: SessionCreatedEvent) {
        logger.info("Creating session: ${event.source.id}")
    }

    @EventListener
    fun onSessionDestroyed(event: SessionDestroyedEvent) {
        logger.info("Destroying session: ${event.source.id}")
    }

    @EventListener
    fun onSessionDeleted(event: SessionDeletedEvent) {
        logger.info("Deleting session: ${event.source.id}")
    }

    @EventListener
    fun onSessionExpired(event: SessionExpiredEvent) {
        logger.info("Expiring session: ${event.source.id}")
    }
}