package culturemedia.service.Impl;

import java.util.List;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.service.CulturemediaService;

public class CulturemediaServiceImpl implements CulturemediaService
{
    private VideoRepository videoRepository;
    private ViewsRepository viewsRepository;

    @Override
    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    @Override
    public Video add(Video video) {
        return videoRepository.add( video );
    }

    @Override
    public View add(View view) {
        return viewsRepository.add( view );
    }
}