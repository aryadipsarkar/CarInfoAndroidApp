# Car-Info
The main activity in the app displays a grid. Each grid cell contains a thumbnail picture of a car (from
outside the car) above the name of the car’s manufacturer. For instance, a grid cell could contain a thumbnail
showing a Honda Civic, above the name “Honda”. Pictures are chosen to fit the
pictures into thumbnails appearing in the grid view (e.g. whether to scale the picture or not, etc.) Thumbnails are separated by thin spaces (no more than 5 dp) uniformly on all four sides when the
grid is displayed on a Nexus 5 device. Also, size the thumbnails appropriately, e.g., using 2 or 3 columns
in portrait mode. Thumbnails are designed to fill at least most of a Nexus 5’s display with
picture grid (i.e., at least 6 cells if using two columns). <br/>
<br/>
Each grid cell supports two kinds of functionality, depending on whether an app viewer performs a short
vs. a long click on a cell. A short click brings up a new activity that shows the entire picture of the selected
car on the entire device display. This picture must be a higher resolution and bigger than the thumbnail
displayed earlier. The user can return to the grid view by selecting the “back” soft button on the phone.
However, if a user clicks on the displayed picture instead, you must open a browser activity showing the
web site of the car’s manufacturer. For instance, if the app shows a picture of a Honda Civic, the app
should bring up the Honda web page from the official Honda web site.<br/>
<br/>
A long click on a grid cell brings up a “context menu” showing the following three options for the car
under consideration: (1) View the entire picture (similar to a short click); (2) Show the official web page of
the car manufacturer in a new activity; and (3) bring up a list containing the names and addresses of at least
three car dealers for the selected manufacturer in greater Chicago area.<br/>
<br/>
*PS: Tested by using Nexus 5 virtual device running the Android platform (API 23—Marshmallow). No backward compatibility provided.*
