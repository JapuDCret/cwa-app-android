package de.rki.coronawarnapp.notification

import de.rki.coronawarnapp.R
import org.joda.time.Duration

/**
 * The notification constants are used inside the NotificationHelper
 *
 * @see NotificationHelper
 */
object NotificationConstants {

    const val NOTIFICATION_ID = "NOTIFICATION_ID"

    const val POSITIVE_RESULT_NOTIFICATION_ID = 100
    const val POSITIVE_RESULT_NOTIFICATION_TOTAL_COUNT = 2
    val POSITIVE_RESULT_NOTIFICATION_INITIAL_OFFSET: Duration = Duration.standardHours(2)
    val POSITIVE_RESULT_NOTIFICATION_INTERVAL: Duration = Duration.standardHours(2)

    /**
     * Notification channel id String.xml path
     */
    const val NOTIFICATION_CHANNEL_ID = R.string.notification_channel_id

    /**
     * Notification small icon String.xml path
     */
    const val NOTIFICATION_SMALL_ICON = R.drawable.ic_splash_logo

    /**
     * Notification channel name String.xml path
     */
    const val CHANNEL_NAME = R.string.notification_name

    /**
     * Notification channel description String.xml path
     */
    const val CHANNEL_DESCRIPTION = R.string.notification_description

    /**
     * Risk changed notification title String.xml path
     */
    const val NOTIFICATION_CONTENT_TITLE_RISK_CHANGED = R.string.notification_headline

    /**
     * Risk changed notification content text String.xml path
     */
    const val NOTIFICATION_CONTENT_TEXT_RISK_CHANGED = R.string.notification_body
}
