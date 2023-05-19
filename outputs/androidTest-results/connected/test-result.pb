
â>
X
LabTestActivityTestcom.example.healthcaretestItemClick2‰‘ù£Ä«Ωø:Ê‘ù£ÄÓùÚö8
¸androidx.test.espresso.PerformException: Error performing 'load adapter data' on view 'Animations or transitions are enabled on the target device.
For more info check: https://developer.android.com/training/testing/espresso/setup#set-up-environment

view.getId() is <2131231024/com.example.healthcare:id/listViewBMCart>'.
at androidx.test.espresso.PerformException$Builder.build(PerformException.java:1)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:8)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:9)
at androidx.test.espresso.base.DefaultFailureHandler$TypedFailureHandler.handle(DefaultFailureHandler.java:4)
at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:5)
at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:8)
at androidx.test.espresso.ViewInteraction.desugaredPerform(ViewInteraction.java:11)
at androidx.test.espresso.ViewInteraction.perform(ViewInteraction.java:8)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:7)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:13)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.displayDataMatcher(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction.makeTargetMatcher(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction.perform(DataInteraction.java:1)
at com.example.healthcare.LabTestActivityTest.testItemClick(LabTestActivityTest.java:53)
... 35 trimmed
Caused by: java.lang.RuntimeException: No data found matching: view.getId() is <2131231024> contained values: <[Data: {line5=Total Cost:¬£200, line4=, line3=, line2=, line1=Package 1 : Full Body Checkup} (class: java.util.HashMap) token: 0, Data: {line5=Total Cost:¬£299, line4=, line3=, line2=, line1=Package 2 : Blood Glucose Fasting} (class: java.util.HashMap) token: 1, Data: {line5=Total Cost:¬£70, line4=, line3=, line2=, line1=Package 3 : COVID-19 Antibody - IgG} (class: java.util.HashMap) token: 2, Data: {line5=Total Cost:¬£130, line4=, line3=, line2=, line1=Package 4 : Thyroid Check} (class: java.util.HashMap) token: 3, Data: {line5=Total Cost:¬£170, line4=, line3=, line2=, line1=Package 5 : Immunity Check} (class: java.util.HashMap) token: 4]>
at androidx.test.espresso.action.AdapterDataLoaderAction.perform(AdapterDataLoaderAction.java:15)
at androidx.test.espresso.ViewInteraction$SingleExecutionViewAction.perform(ViewInteraction.java:2)
at androidx.test.espresso.ViewInteraction.doPerform(ViewInteraction.java:25)
at androidx.test.espresso.ViewInteraction.-$$Nest$mdoPerform(Unknown Source:0)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:7)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:1)
at java.util.concurrent.FutureTask.run(FutureTask.java:264)
at android.os.Handler.handleCallback(Handler.java:942)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:240)
at android.os.Looper.loop(Looper.java:351)
at android.app.ActivityThread.main(ActivityThread.java:8380)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:584)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1013)java.lang.RuntimeException¸androidx.test.espresso.PerformException: Error performing 'load adapter data' on view 'Animations or transitions are enabled on the target device.
For more info check: https://developer.android.com/training/testing/espresso/setup#set-up-environment

view.getId() is <2131231024/com.example.healthcare:id/listViewBMCart>'.
at androidx.test.espresso.PerformException$Builder.build(PerformException.java:1)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:8)
at androidx.test.espresso.base.PerformExceptionHandler.handleSafely(PerformExceptionHandler.java:9)
at androidx.test.espresso.base.DefaultFailureHandler$TypedFailureHandler.handle(DefaultFailureHandler.java:4)
at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:5)
at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:8)
at androidx.test.espresso.ViewInteraction.desugaredPerform(ViewInteraction.java:11)
at androidx.test.espresso.ViewInteraction.perform(ViewInteraction.java:8)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher$1.apply(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:7)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.<init>(DataInteraction.java:13)
at androidx.test.espresso.DataInteraction$DisplayDataMatcher.displayDataMatcher(DataInteraction.java:1)
at androidx.test.espresso.DataInteraction.makeTargetMatcher(DataInteraction.java:2)
at androidx.test.espresso.DataInteraction.perform(DataInteraction.java:1)
at com.example.healthcare.LabTestActivityTest.testItemClick(LabTestActivityTest.java:53)
... 35 trimmed
Caused by: java.lang.RuntimeException: No data found matching: view.getId() is <2131231024> contained values: <[Data: {line5=Total Cost:¬£200, line4=, line3=, line2=, line1=Package 1 : Full Body Checkup} (class: java.util.HashMap) token: 0, Data: {line5=Total Cost:¬£299, line4=, line3=, line2=, line1=Package 2 : Blood Glucose Fasting} (class: java.util.HashMap) token: 1, Data: {line5=Total Cost:¬£70, line4=, line3=, line2=, line1=Package 3 : COVID-19 Antibody - IgG} (class: java.util.HashMap) token: 2, Data: {line5=Total Cost:¬£130, line4=, line3=, line2=, line1=Package 4 : Thyroid Check} (class: java.util.HashMap) token: 3, Data: {line5=Total Cost:¬£170, line4=, line3=, line2=, line1=Package 5 : Immunity Check} (class: java.util.HashMap) token: 4]>
at androidx.test.espresso.action.AdapterDataLoaderAction.perform(AdapterDataLoaderAction.java:15)
at androidx.test.espresso.ViewInteraction$SingleExecutionViewAction.perform(ViewInteraction.java:2)
at androidx.test.espresso.ViewInteraction.doPerform(ViewInteraction.java:25)
at androidx.test.espresso.ViewInteraction.-$$Nest$mdoPerform(Unknown Source:0)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:7)
at androidx.test.espresso.ViewInteraction$1.call(ViewInteraction.java:1)
at java.util.concurrent.FutureTask.run(FutureTask.java:264)
at android.os.Handler.handleCallback(Handler.java:942)
at android.os.Handler.dispatchMessage(Handler.java:99)
at android.os.Looper.loopOnce(Looper.java:240)
at android.os.Looper.loop(Looper.java:351)
at android.app.ActivityThread.main(ActivityThread.java:8380)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:584)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1013)"∆

logcatandroid∞
≠C:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\logcat-com.example.healthcare.LabTestActivityTest-testItemClick.txt"î

device-infoandroidz
xC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\device-info.pb"ï

device-info.meminfoandroids
qC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\meminfo"ï

device-info.cpuinfoandroids
qC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\cpuinfoˆ
]
LabTestActivityTestcom.example.healthcaretestGoToCartButton2Ê‘ù£Äˆ˚∞:Ë‘ù£¿ñ√ˆ"À

logcatandroidµ
≤C:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\logcat-com.example.healthcare.LabTestActivityTest-testGoToCartButton.txt"î

device-infoandroidz
xC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\device-info.pb"ï

device-info.meminfoandroids
qC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\meminfo"ï

device-info.cpuinfoandroids
qC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\cpuinfoÓ
Y
LabTestActivityTestcom.example.healthcaretestBackButton2Ë‘ù£Ä®≤—:Í‘ù£ÄœÄê"«

logcatandroid±
ÆC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\logcat-com.example.healthcare.LabTestActivityTest-testBackButton.txt"î

device-infoandroidz
xC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\device-info.pb"ï

device-info.meminfoandroids
qC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\meminfo"ï

device-info.cpuinfoandroids
qC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\cpuinfo" *˚
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriverÖ
ÇC:\Users\akula\OneDrive\Desktop\BrightonMedi\app\build\outputs\androidTest-results\connected\CPH2285 - 13\testlog\test-results.log 2
text/plain