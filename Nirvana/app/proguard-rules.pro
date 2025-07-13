# Add project-specific ProGuard rules here.
# If your project uses libraries, specify them below.

# Firebase
-keep class com.google.firebase.** { *; }
-dontwarn com.google.firebase.**

# Segment
-keep class com.segment.** { *; }
-dontwarn com.segment.**

# Jetpack Compose
-keep class androidx.compose.** { *; }
-dontwarn androidx.compose.**
