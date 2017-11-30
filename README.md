Appium setup
============

1.Install Appium v1.7.1
2.Install appium studio to identify the elemnets, download from the below added link
https://experitest.com/mobile-test-automation/appium-studio/
3.Steps to install appium on windows in below link
http://www.automationtestinghub.com/download-and-install-appium-1-6/
4.Steps to install appium on mac in the below link
https://www.npmjs.com/package/appium
5.run “appium-doctor” to ensure your system is set up properly


TestNG Framework installation steps

1. Install Eclipse or IntelliJ
2. Install TesNG from eclipse market place or Install TestNG from IntelliJ plugins
3. Download the project from the git repository 
https://github.com/tejavan/QantasAssure-App-POC
4.Open the project with either eclipse or IntelliJ
5.Let the pom.xml to auto import all the dependencies
5.Check if imported project is not showing any configurations errors


Important steps to follow before triggering the suite

1.When all the setup is done, then connect the device and type “idevice_id -l” to check if ideviceinstaller is identifying the device. If not please install “http://macappstore.org/ideviceinstaller/“

2.Additional steps to be performed on mac
```shell
brew install ideviceinstaller
brew install carthage
npm install -g ios-deploy
npm install deviceconsole
sudo gem install xcpretty
brew install libimobiledevice --HEAD
```

Install the latest beta Appium (currently 1.6.4 beta):

```shell
npm uninstall -g appium && npm install -g appium@beta
```

Open terminal & open the the WebDriverAgent folder:
```shell
/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent
```

Run the following 2 commands:
```shell
mkdir -p Resources/WebDriverAgent.bundle
sh ./Scripts/bootstrap.sh -d
```

Open the WebDriverAgent in Xcode project (Under the WebDriverAgent folder) 
Open WebDriverAgent.xcodeproj -a "xcode"
Install the webdriver agent on connected device
Select WebDriverAgentRunner—>select the device—>click on Xcode play button
Select WebDriverAgentRunner-nodebug—>select the device—>click on Xcode play button
Select WebDriverAgentLib—>select the device—>click on Xcode play button

3.Now run the command appium to start appium server

4.Navigate to pom.xml location and run the following command `mvn clean test -DsuiteXmlFile=testng.xml` to trigger the automation suite
