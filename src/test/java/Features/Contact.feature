Feature: Login Feature

Scenario Outline: Login

Given Initialize the browser
And navagate to "https://qtrecognition.testqtwiz.com/" site
When click on <un> and <pwd>
Then click on login button

Examples: 
|un		|pwd	|
|darshan.asundi@qualitestgroup.com		|P@ssw0rd		|
|darshan.asundi@qualitestgroup.com		|P@SSW0RD		|
