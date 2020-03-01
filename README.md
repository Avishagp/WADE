# WADE
Widget Applications Display Engine.

Widget Applications Display Engine. A widget manager application. Users can configure multiple widgets to display on their screens. Initially developed for Raspberry Pi. Ultimately can be expanded and designed to run on any display. The widgets are designed to provide live data of different formats – ergo, some will be based on network communication. Widgets will function without receiving any form of input from users.

The project’s architecture is based on the Client-Server pattern. Client side – focuses on presentation of widgets and their relevant data, while server side is responsible for producing the said data. That way, alternating data polling implementations becomes cleaner and is managed only on server side.

Once running, the client side parses a configuration file. The file details the requested widgets that the user wishes to display. The number of widgets that can be displayed at once is limited.
