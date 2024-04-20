package culturemedia.service;

import java.util.List;

import culturemedia.model.Video;
import culturemedia.model.View;

public interface CulturemediaService
{
    List<Video> findAll();
    Video add(Video video);
    View add(View view);
}