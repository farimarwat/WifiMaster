# WifiMaster

World's Largest wifi pasword database
# Important
This is an API depends upon other's cloud storage and it is untrusted that how long it goes online. The data is in millions (all over the world) and shared by public users.
Now download all the records and upload to your own server for maintaince. There are two ideas that how to fetch it. Go to the bottom for this.

## API implementation
```
implementation 'io.github.farimarwat:wifimaster:1.0'
```

## Usage
### Create Instance
```
val wm = WifiMaster()
```
### Get Wifi by Id
The Id is row id in database.It can start from 1 to unlimited(in millions).
In case, if not data found regarding this id, then response mage some thing like this but not the exact = "No Hotspot found"
```
//get by id
wm.getWifiById(
    44001,
    onCompleted = {
                  Log.e(TAG,it)
    },
    onError = {
        Log.e(TAG,it)
    }
)
```

### Output of get by id:
```
{
  "message": "OK",
  "id": 16904782,
  "public": true,
  "ssid": "M Zubair",
  "created_at": 1677521336,
  "hotspot_type": 1,
  "bssids": [
    53061108558980
  ],
  "security.type": 2,
  "security.password": "ASIM12345678",
  "location.latitude": 34.01223,
  "location.longitude": 71.57783,
  "location.city": 1168197,
  "location.country": "PK",
  "quality.rating": 2,
  "quality.last_seen": 1677521336,
  "quality.p_exists": 1,
  "quality.p_internet": 0.91,
  "statistics.last_connection_time": 1677521336,
  "user.id": 245735545,
  "user.name": "Asim Khan",
  "user.score": 1025
}
```


### List Wifis by Lat, Lon
```
//list by lat and lon
wm.listWifiListByLatLong(
    "33.601920","73.038080",
    onCompleted = {
        Log.e(TAG,it)
    },
    onError = {
        Log.e(TAG,it)
    }
)
```

### Output of List by Lat, Lon
```
{
  "message": "OK",
  "hotspots": [
    {
      "id": 16653852,
      "public": true,
      "ssid": "Hammad Com...",
      "created_at": 1665304602,
      "hotspot_type": 1,
      "bssids": [
        224494205563168
      ],
      "security.type": 2,
      "security.password": "11335577",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1676192041,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1665304602,
      "user.id": 225473272,
      "user.name": "user3272",
      "user.score": 100
    },
    {
      "id": 16703468,
      "public": true,
      "ssid": "Dilbar jamal",
      "created_at": 1666705912,
      "hotspot_type": 1,
      "bssids": [
        168065375250930
      ],
      "security.type": 2,
      "security.password": "00099266",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1690847998,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1666705912,
      "user.id": 229095739,
      "user.name": "user5739",
      "user.score": 100
    },
    {
      "id": 16731931,
      "public": true,
      "ssid": "Malik Awan 786",
      "created_at": 1667607735,
      "hotspot_type": 1,
      "bssids": [
        9075053281056
      ],
      "security.type": 2,
      "security.password": "1234567890",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1689794971,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1667607735,
      "user.id": 230179268,
      "user.name": "user9268",
      "user.score": 120
    },
    {
      "id": 16888181,
      "public": true,
      "ssid": "OPPO F9",
      "created_at": 1676225576,
      "hotspot_type": 1,
      "bssids": [
        200579456074393
      ],
      "security.type": 2,
      "security.password": "12345678",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1676288129,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1676225576,
      "user.id": 244310719,
      "user.name": "abhilash game mjvr",
      "user.score": 300
    },
    {
      "id": 16918544,
      "public": true,
      "ssid": "Yasir abbas ",
      "created_at": 1678596645,
      "hotspot_type": 1,
      "bssids": [
        2199023255552
      ],
      "security.type": 2,
      "security.password": "06461174",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1678596645,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1678596645,
      "user.id": 247266728,
      "user.name": "thisismiracle6728",
      "user.score": 200
    },
    {
      "id": 16984369,
      "public": true,
      "ssid": "MyNet 4057",
      "created_at": 1685092706,
      "hotspot_type": 1,
      "bssids": [
        27310756242662
      ],
      "security.type": 2,
      "security.password": "Amar786",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1685092755,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1685092706,
      "user.id": 255801980,
      "user.name": "Ahmed Raza",
      "user.score": 200
    },
    {
      "id": 17016798,
      "public": true,
      "ssid": "shazaib",
      "created_at": 1688715429,
      "hotspot_type": 1,
      "bssids": [
        220152325409592
      ],
      "security.type": 2,
      "security.password": "SHAHzaib122",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "venue.id": "",
      "venue.name": "",
      "quality.rating": 2,
      "quality.last_seen": 1688715429,
      "quality.p_exists": 1,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1688715429,
      "user.id": 259533444,
      "user.name": "user3444",
      "user.score": 120
    },
    {
      "id": 16089477,
      "public": true,
      "ssid": "Jazz-LTE-8291",
      "created_at": 1652003742,
      "hotspot_type": 1,
      "bssids": [
        278027552195217
      ],
      "security.type": 2,
      "security.password": "84061207",
      "location.latitude": 33.6054,
      "location.longitude": 73.0354,
      "location.city": 1166993,
      "location.country": "PK",
      "quality.rating": 2,
      "quality.last_seen": 1652005388,
      "quality.p_exists": 0.75,
      "quality.p_internet": 1,
      "statistics.last_connection_time": 1652003742,
      "user.id": 200268995,
      "user.name": "Zubir Khan",
      "user.score": 200
    }
  ]
}

```

## How to fetch and save
### Method 1 (use listWifiListByLatLong()):
Create a short one page app, show map to the user and show hotspots according to current location. Along with this each fetch
also upload this fetched data to your own server via your own api.
Release the app with full investment/ads. Increaseing users means more data upload to your server

### Method 2 (use getWifiById()):
Use your own mobiles upt 10, 20 or may 30. Run loop on the method and upload to your server. Start from id = 1.
For looping, use recursion not the actual loop.

## Note:
If you do not want to buy a server then use room db, run the app in emulator and start to populate. After population, goto internal storage, app's database folder and extract the .db file.

