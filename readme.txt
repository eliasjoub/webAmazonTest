allure report : https://docs.qameta.io/allure/
install command: scoop install allure

Also Scoop is capable of updating Allure distribution installations. To do so navigate to the Scoop installation directory and execute

\bin\checkver.ps1 allure -u
This will check for newer versions of Allure, and update the manifest file. Then execute

scoop update allure