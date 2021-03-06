/*******************************************************************************
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

import org.junit.*;
import static org.junit.Assert.*;

import java.time.chrono.JapaneseDate;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ManualTest{
    @Test
    public void check(){
        System.out.println("Please check below manually...");
        System.out.println("LocalDate.now():\t"+ LocalDate.now());
        System.out.println("LocalDateTime.now():\t"+ LocalDateTime.now());
        System.out.println("JapaneseDate.now():\t"+ JapaneseDate.now());
        System.out.println("ZoneId.systemDefault():\t"+ ZoneId.systemDefault());
        System.out.println("ZonedDateTime.now():\t"+ ZonedDateTime.now());
    }
}

