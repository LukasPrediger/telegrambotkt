# TelegrambotKt
A kotlin first Telegram Bot Client Library for Kotlin and Java supporting coroutines and blocking development

>:warning: The project is still work in progress, check Features section to see what part are production ready

## Versioning
The project uses the following version scheme:

`LibMajor.LibMinor.LibBugfix-ApiMajor.ApiMinor`

So the library version 1.0.0, support Api version 6.7 would look as follows
`1.0.0-6.7`

This is to decouple the library release flow from the release flow of telegram. Api Changes normally result in a minor update of the library. If breaking changes are required from the telegram api, a major lib release will follow

## Modules
The project is split into the following modules

| Name         | Description                                                                              |
|--------------|------------------------------------------------------------------------------------------|
| Meta         | Contains a mapping for all telegram api objects                                          |
| Client       | Client to communicate with the telegram api. Does not contain any update receiving logic |
| Long Polling | Ability to receive updates via long polling                                              |
| Webhook      | Ability to receive updates via websocket                                                 |



## Features

| Feature                 | Status                       |
|-------------------------|------------------------------|
| API Mapping             | :construction: In Progess    |
| Sending Simple Messages | :ballot_box_with_check: TODO |
| Uploading Files         | :ballot_box_with_check: TODO |
| Group Management        | :ballot_box_with_check: TODO |
| Bot Management          | :ballot_box_with_check: TODO |
| ReplyMarkups            | :ballot_box_with_check: TODO |
| Inline Mode             | :ballot_box_with_check: TODO |
| Stickers                | :ballot_box_with_check: TODO |
| Payments                | :ballot_box_with_check: TODO |
| Telegram Passport       | :ballot_box_with_check: TODO |
| Games                   | :ballot_box_with_check: TODO |
| Web Apps                | :ballot_box_with_check: TODO |
| LongPolling             | :ballot_box_with_check: TODO |
| Webhook                 | :ballot_box_with_check: TODO |
