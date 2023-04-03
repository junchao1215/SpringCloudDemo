package file;

import common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/oss/file")
public class FileController {
    @Autowired
    private FileService fileService;
    @RequestMapping("upload")
    public Result fileUpload(@RequestParam("file") MultipartFile multipartFile){
        String url = fileService.upload(multipartFile);

        return Result.ok(url);
    }
}
