package com.eswari.hello.spring.SkillTracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Skilltracker {
    @GetMapping("list")
    @ResponseBody
    public String hellolist() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn.Here is a List. </h2>" +
                        "<ol>" +
                        "<li>Java</li>"+
                        "<li>JavaScript</li>"+
                        "<li>Python</li>"+
                        "<ol>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
   @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form  action = '/skillpost' >" +
                        "<label>Name:</label><br>"+
                        "<input type = 'text' name = 'name' /><br>" +
                        "<label >My favorite Language:</label><br>"+
                        "<select name='language1'> "+
                        "<option value='Java'>Java</option>"+
                        "<option value='JavaScript'>JavaScript</option>"+
                        "<option value='Python'>Python</option></select>"
                        +"<br>"+

                        "<label >My second favorite Language:</label><br>"+
                        "<select name='language2'> "+
                        "<option value='Java'>Java</option>"+
                        "<option value='JavaScript'>JavaScript</option>"+
                        "<option value='Python'>Python</option></select><br>"+

                        "<label >My third favorite Language:</label><br>"+
                        "<select name='language3'> "+
                        "<option value='Java'>Java</option>"+
                        "<option value='JavaScript'>JavaScript</option>"+
                        "<option value='Python'>Python</option></select>"+
                        "<input type = 'submit' value = 'Submit' />" +
                        "<br>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

//@RequestMapping(value="skillpost",method={RequestMethod.GET})
@GetMapping("/skillpost")
@ResponseBody
public String skillsprocessing(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
    return "<h1>" + name + "</h1>" +
            "<ol>" +
            "<li>" + language1 + "</li>" +
            "<li>" + language2 + "</li>" +
            "<li>" + language3 + "</li>" +
            "</ol>"+
            "<p>Table with color group</p>"+
            "<table>"+
            "<colgroup span='3'></colgroup>"+
 " <tr>"+
    "<th>My 1st favorite Language</th>"+
    "<th>My 2nd favorite Languaget</th>"+
    "<th>My 3rd favorite Language</th>"+
  "</tr>"+
  "<tr>"+
    "<td> "+ language1 + "</td>"+
    "<td>" + language2 + "</td>"+
    "<td> "+ language3 + "</td>"+
  "</tr>"+

"</table>"
            ;
}
}
