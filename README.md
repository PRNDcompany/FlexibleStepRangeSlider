# What is FlexibleStepRangeSlider
- We use RangeSlider in Material Components for range filter as below
<br><img src="https://github.com/PRNDcompany/FlexibleStepRangeSlider/blob/main/arts/range_slider.png" width=300/>
- But it has fixed step size so we have to render even if input values are dynamic gap. 
- `FlexibleStepRangeSlider` has flexible step based on RangeSlider with Material Component

<br><br><br><br>
## Demo
|Sample|Filter|
|:-:|:-:|
|<img src="https://github.com/PRNDcompany/FlexibleStepRangeSlider/blob/main/arts/sample_2.gif" width=300/>|<img src="https://github.com/PRNDcompany/FlexibleStepRangeSlider/blob/main/arts/sample_1.gif" width=300/>

<br><br><br><br>
## Setup
### Gradle
[![Maven Central](https://img.shields.io/maven-central/v/kr.co.prnd/flexiblestep-rangeslider.svg?label=Maven%20Central)](https://search.maven.org/search?q=a:flexiblestep-rangeslider)
```gradle
dependencies {
    implementation 'kr.co.prnd:flexiblestep-rangeslider:x.x.x'
}
```

<br><br><br><br>
## How to use

### XML
```xml
<kr.co.prnd.slider.FlexibleStepRangeSlider
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingHorizontal="20dp"
    android:paddingVertical="20dp"
    android:valueFrom="float" 
    android:valueTo="float"
    app:thumbColorActive="color"
    app:thumbColorInactive="color"
    app:thumbElevationActive="dimension"
    app:thumbElevationInactive="dimension"
    app:thumbRadiusActive="dimension"
    app:thumbRadiusInactive="dimension"
    app:thumbStrokeColorActive="color"
    app:thumbStrokeColorInactive="color"
    app:thumbStrokeWidthActive="dimension"
    app:thumbStrokeWidthInactive="dimension"
    app:tickColorActive="color"
    app:tickColorInactive="color"
    app:tickVisible="boolean"
    app:trackColorActive="color"
    app:trackColorInactive="color"
    app:trackHeight="dimension"
    app:values="floatArray" />
```

### Function
- setters to change attributes
- `valueFrom`, `valueTo` property is currently actual value on slider
- `setValues()`: initate range slider. (optional) `ValueFrom` `valueTo` parameters indicate start position.
- `OnValueChangeListener` notify registered lisetner when value changed.
```kotlin
// smooth slider
slider.setValues(
    values = listOf(0f, 100f), 
    valueFrom = initailValueFrom, 
    valueTo = initialValueTo
)
// flexible slider
slider.setValues(
    valuse = listOf(0f, 10f, 20f, 30f, 50f, 100f, 150f, 200f),
    valueFrom = initialValueFrom,
    valueTo = initialValueTo
)

slider.valueFrom // actual value from range
slider.valueTo // actual value from range

slider.addOnValueChangeListener { from, to state -> 
    when (state) {
        // Called when dragging to thumb
        ValueChangeState.Dragging -> updateValue(from, to)
        // Called when update values or take off thumb
        ValueChangeState.Idle -> {
            updateValue(from, to)
            fetchValueChange(from, to)
        }
    }
}
```

<br><br><br><br>
## License 
 ```code
Copyright 2021 PRNDcompany

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
