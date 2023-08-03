package com.fungiggle.wifimasterexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.blackhat.wifipasswords.WifiMaster
import com.fungiggle.wifimasterexample.ui.theme.WifiMasterExampleTheme
const val TAG = "WifiMaster"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WifiMasterExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val wm = WifiMaster()

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
                }
            }
        }
    }
}