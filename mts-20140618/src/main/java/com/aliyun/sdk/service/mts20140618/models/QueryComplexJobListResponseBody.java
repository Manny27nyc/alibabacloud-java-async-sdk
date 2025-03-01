// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryComplexJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryComplexJobListResponseBody</p>
 */
public class QueryComplexJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    private JobList jobList;

    @NameInMap("NonExistJobIds")
    private NonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    private String requestId;

    private QueryComplexJobListResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.nonExistJobIds = builder.nonExistJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryComplexJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobList
     */
    public JobList getJobList() {
        return this.jobList;
    }

    /**
     * @return nonExistJobIds
     */
    public NonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobList jobList; 
        private NonExistJobIds nonExistJobIds; 
        private String requestId; 

        /**
         * JobList.
         */
        public Builder jobList(JobList jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * NonExistJobIds.
         */
        public Builder nonExistJobIds(NonExistJobIds nonExistJobIds) {
            this.nonExistJobIds = nonExistJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryComplexJobListResponseBody build() {
            return new QueryComplexJobListResponseBody(this);
        } 

    } 

    public static class Effect extends TeaModel {
        @NameInMap("Effect")
        private String effect;

        @NameInMap("EffectConfig")
        private String effectConfig;

        private Effect(Builder builder) {
            this.effect = builder.effect;
            this.effectConfig = builder.effectConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Effect create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return effectConfig
         */
        public String getEffectConfig() {
            return this.effectConfig;
        }

        public static final class Builder {
            private String effect; 
            private String effectConfig; 

            /**
             * Effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * EffectConfig.
             */
            public Builder effectConfig(String effectConfig) {
                this.effectConfig = effectConfig;
                return this;
            }

            public Effect build() {
                return new Effect(this);
            } 

        } 

    }
    public static class Effects extends TeaModel {
        @NameInMap("Effect")
        private java.util.List < Effect> effect;

        private Effects(Builder builder) {
            this.effect = builder.effect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Effects create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public java.util.List < Effect> getEffect() {
            return this.effect;
        }

        public static final class Builder {
            private java.util.List < Effect> effect; 

            /**
             * Effect.
             */
            public Builder effect(java.util.List < Effect> effect) {
                this.effect = effect;
                return this;
            }

            public Effects build() {
                return new Effects(this);
            } 

        } 

    }
    public static class Clip extends TeaModel {
        @NameInMap("Effects")
        private Effects effects;

        @NameInMap("Id")
        private String id;

        @NameInMap("In")
        private String in;

        @NameInMap("Out")
        private String out;

        @NameInMap("SourceID")
        private String sourceID;

        @NameInMap("SourceStrmMap")
        private String sourceStrmMap;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Type")
        private String type;

        private Clip(Builder builder) {
            this.effects = builder.effects;
            this.id = builder.id;
            this.in = builder.in;
            this.out = builder.out;
            this.sourceID = builder.sourceID;
            this.sourceStrmMap = builder.sourceStrmMap;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clip create() {
            return builder().build();
        }

        /**
         * @return effects
         */
        public Effects getEffects() {
            return this.effects;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return in
         */
        public String getIn() {
            return this.in;
        }

        /**
         * @return out
         */
        public String getOut() {
            return this.out;
        }

        /**
         * @return sourceID
         */
        public String getSourceID() {
            return this.sourceID;
        }

        /**
         * @return sourceStrmMap
         */
        public String getSourceStrmMap() {
            return this.sourceStrmMap;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Effects effects; 
            private String id; 
            private String in; 
            private String out; 
            private String sourceID; 
            private String sourceStrmMap; 
            private String sourceType; 
            private String type; 

            /**
             * Effects.
             */
            public Builder effects(Effects effects) {
                this.effects = effects;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * In.
             */
            public Builder in(String in) {
                this.in = in;
                return this;
            }

            /**
             * Out.
             */
            public Builder out(String out) {
                this.out = out;
                return this;
            }

            /**
             * SourceID.
             */
            public Builder sourceID(String sourceID) {
                this.sourceID = sourceID;
                return this;
            }

            /**
             * SourceStrmMap.
             */
            public Builder sourceStrmMap(String sourceStrmMap) {
                this.sourceStrmMap = sourceStrmMap;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Clip build() {
                return new Clip(this);
            } 

        } 

    }
    public static class ClipList extends TeaModel {
        @NameInMap("Clip")
        private java.util.List < Clip> clip;

        private ClipList(Builder builder) {
            this.clip = builder.clip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipList create() {
            return builder().build();
        }

        /**
         * @return clip
         */
        public java.util.List < Clip> getClip() {
            return this.clip;
        }

        public static final class Builder {
            private java.util.List < Clip> clip; 

            /**
             * Clip.
             */
            public Builder clip(java.util.List < Clip> clip) {
                this.clip = clip;
                return this;
            }

            public ClipList build() {
                return new ClipList(this);
            } 

        } 

    }
    public static class TimelineConfigAudio extends TeaModel {
        @NameInMap("ChannelLayout")
        private String channelLayout;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("Samplerate")
        private String samplerate;

        private TimelineConfigAudio(Builder builder) {
            this.channelLayout = builder.channelLayout;
            this.channels = builder.channels;
            this.samplerate = builder.samplerate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineConfigAudio create() {
            return builder().build();
        }

        /**
         * @return channelLayout
         */
        public String getChannelLayout() {
            return this.channelLayout;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        public static final class Builder {
            private String channelLayout; 
            private String channels; 
            private String samplerate; 

            /**
             * ChannelLayout.
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Samplerate.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            public TimelineConfigAudio build() {
                return new TimelineConfigAudio(this);
            } 

        } 

    }
    public static class TimelineConfigVideo extends TeaModel {
        @NameInMap("BgColor")
        private String bgColor;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Height")
        private String height;

        @NameInMap("IsGpuData")
        private String isGpuData;

        @NameInMap("IsOneTrackData")
        private String isOneTrackData;

        @NameInMap("ReclosePrec")
        private String reclosePrec;

        @NameInMap("RenderRatio")
        private String renderRatio;

        @NameInMap("Width")
        private String width;

        private TimelineConfigVideo(Builder builder) {
            this.bgColor = builder.bgColor;
            this.fps = builder.fps;
            this.height = builder.height;
            this.isGpuData = builder.isGpuData;
            this.isOneTrackData = builder.isOneTrackData;
            this.reclosePrec = builder.reclosePrec;
            this.renderRatio = builder.renderRatio;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineConfigVideo create() {
            return builder().build();
        }

        /**
         * @return bgColor
         */
        public String getBgColor() {
            return this.bgColor;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return isGpuData
         */
        public String getIsGpuData() {
            return this.isGpuData;
        }

        /**
         * @return isOneTrackData
         */
        public String getIsOneTrackData() {
            return this.isOneTrackData;
        }

        /**
         * @return reclosePrec
         */
        public String getReclosePrec() {
            return this.reclosePrec;
        }

        /**
         * @return renderRatio
         */
        public String getRenderRatio() {
            return this.renderRatio;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bgColor; 
            private String fps; 
            private String height; 
            private String isGpuData; 
            private String isOneTrackData; 
            private String reclosePrec; 
            private String renderRatio; 
            private String width; 

            /**
             * BgColor.
             */
            public Builder bgColor(String bgColor) {
                this.bgColor = bgColor;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * IsGpuData.
             */
            public Builder isGpuData(String isGpuData) {
                this.isGpuData = isGpuData;
                return this;
            }

            /**
             * IsOneTrackData.
             */
            public Builder isOneTrackData(String isOneTrackData) {
                this.isOneTrackData = isOneTrackData;
                return this;
            }

            /**
             * ReclosePrec.
             */
            public Builder reclosePrec(String reclosePrec) {
                this.reclosePrec = reclosePrec;
                return this;
            }

            /**
             * RenderRatio.
             */
            public Builder renderRatio(String renderRatio) {
                this.renderRatio = renderRatio;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public TimelineConfigVideo build() {
                return new TimelineConfigVideo(this);
            } 

        } 

    }
    public static class TimelineConfig extends TeaModel {
        @NameInMap("TimelineConfigAudio")
        private TimelineConfigAudio timelineConfigAudio;

        @NameInMap("TimelineConfigVideo")
        private TimelineConfigVideo timelineConfigVideo;

        private TimelineConfig(Builder builder) {
            this.timelineConfigAudio = builder.timelineConfigAudio;
            this.timelineConfigVideo = builder.timelineConfigVideo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimelineConfig create() {
            return builder().build();
        }

        /**
         * @return timelineConfigAudio
         */
        public TimelineConfigAudio getTimelineConfigAudio() {
            return this.timelineConfigAudio;
        }

        /**
         * @return timelineConfigVideo
         */
        public TimelineConfigVideo getTimelineConfigVideo() {
            return this.timelineConfigVideo;
        }

        public static final class Builder {
            private TimelineConfigAudio timelineConfigAudio; 
            private TimelineConfigVideo timelineConfigVideo; 

            /**
             * TimelineConfigAudio.
             */
            public Builder timelineConfigAudio(TimelineConfigAudio timelineConfigAudio) {
                this.timelineConfigAudio = timelineConfigAudio;
                return this;
            }

            /**
             * TimelineConfigVideo.
             */
            public Builder timelineConfigVideo(TimelineConfigVideo timelineConfigVideo) {
                this.timelineConfigVideo = timelineConfigVideo;
                return this;
            }

            public TimelineConfig build() {
                return new TimelineConfig(this);
            } 

        } 

    }
    public static class ClipsConfigVideo extends TeaModel {
        @NameInMap("L")
        private String l;

        @NameInMap("T")
        private String t;

        private ClipsConfigVideo(Builder builder) {
            this.l = builder.l;
            this.t = builder.t;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipsConfigVideo create() {
            return builder().build();
        }

        /**
         * @return l
         */
        public String getL() {
            return this.l;
        }

        /**
         * @return t
         */
        public String getT() {
            return this.t;
        }

        public static final class Builder {
            private String l; 
            private String t; 

            /**
             * L.
             */
            public Builder l(String l) {
                this.l = l;
                return this;
            }

            /**
             * T.
             */
            public Builder t(String t) {
                this.t = t;
                return this;
            }

            public ClipsConfigVideo build() {
                return new ClipsConfigVideo(this);
            } 

        } 

    }
    public static class ClipsConfig extends TeaModel {
        @NameInMap("ClipsConfigVideo")
        private ClipsConfigVideo clipsConfigVideo;

        private ClipsConfig(Builder builder) {
            this.clipsConfigVideo = builder.clipsConfigVideo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipsConfig create() {
            return builder().build();
        }

        /**
         * @return clipsConfigVideo
         */
        public ClipsConfigVideo getClipsConfigVideo() {
            return this.clipsConfigVideo;
        }

        public static final class Builder {
            private ClipsConfigVideo clipsConfigVideo; 

            /**
             * ClipsConfigVideo.
             */
            public Builder clipsConfigVideo(ClipsConfigVideo clipsConfigVideo) {
                this.clipsConfigVideo = clipsConfigVideo;
                return this;
            }

            public ClipsConfig build() {
                return new ClipsConfig(this);
            } 

        } 

    }
    public static class ClipsClip extends TeaModel {
        @NameInMap("ClipsConfig")
        private ClipsConfig clipsConfig;

        @NameInMap("In")
        private String in;

        @NameInMap("Out")
        private String out;

        @NameInMap("clipID")
        private String clipID;

        private ClipsClip(Builder builder) {
            this.clipsConfig = builder.clipsConfig;
            this.in = builder.in;
            this.out = builder.out;
            this.clipID = builder.clipID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClipsClip create() {
            return builder().build();
        }

        /**
         * @return clipsConfig
         */
        public ClipsConfig getClipsConfig() {
            return this.clipsConfig;
        }

        /**
         * @return in
         */
        public String getIn() {
            return this.in;
        }

        /**
         * @return out
         */
        public String getOut() {
            return this.out;
        }

        /**
         * @return clipID
         */
        public String getClipID() {
            return this.clipID;
        }

        public static final class Builder {
            private ClipsConfig clipsConfig; 
            private String in; 
            private String out; 
            private String clipID; 

            /**
             * ClipsConfig.
             */
            public Builder clipsConfig(ClipsConfig clipsConfig) {
                this.clipsConfig = clipsConfig;
                return this;
            }

            /**
             * In.
             */
            public Builder in(String in) {
                this.in = in;
                return this;
            }

            /**
             * Out.
             */
            public Builder out(String out) {
                this.out = out;
                return this;
            }

            /**
             * clipID.
             */
            public Builder clipID(String clipID) {
                this.clipID = clipID;
                return this;
            }

            public ClipsClip build() {
                return new ClipsClip(this);
            } 

        } 

    }
    public static class Clips extends TeaModel {
        @NameInMap("Clip")
        private java.util.List < ClipsClip> clip;

        private Clips(Builder builder) {
            this.clip = builder.clip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clips create() {
            return builder().build();
        }

        /**
         * @return clip
         */
        public java.util.List < ClipsClip> getClip() {
            return this.clip;
        }

        public static final class Builder {
            private java.util.List < ClipsClip> clip; 

            /**
             * Clip.
             */
            public Builder clip(java.util.List < ClipsClip> clip) {
                this.clip = clip;
                return this;
            }

            public Clips build() {
                return new Clips(this);
            } 

        } 

    }
    public static class Track extends TeaModel {
        @NameInMap("Clips")
        private Clips clips;

        @NameInMap("Id")
        private String id;

        @NameInMap("Order")
        private String order;

        @NameInMap("Type")
        private String type;

        private Track(Builder builder) {
            this.clips = builder.clips;
            this.id = builder.id;
            this.order = builder.order;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Track create() {
            return builder().build();
        }

        /**
         * @return clips
         */
        public Clips getClips() {
            return this.clips;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Clips clips; 
            private String id; 
            private String order; 
            private String type; 

            /**
             * Clips.
             */
            public Builder clips(Clips clips) {
                this.clips = clips;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Track build() {
                return new Track(this);
            } 

        } 

    }
    public static class TrackList extends TeaModel {
        @NameInMap("Track")
        private java.util.List < Track> track;

        private TrackList(Builder builder) {
            this.track = builder.track;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackList create() {
            return builder().build();
        }

        /**
         * @return track
         */
        public java.util.List < Track> getTrack() {
            return this.track;
        }

        public static final class Builder {
            private java.util.List < Track> track; 

            /**
             * Track.
             */
            public Builder track(java.util.List < Track> track) {
                this.track = track;
                return this;
            }

            public TrackList build() {
                return new TrackList(this);
            } 

        } 

    }
    public static class Timeline extends TeaModel {
        @NameInMap("TimelineConfig")
        private TimelineConfig timelineConfig;

        @NameInMap("TrackList")
        private TrackList trackList;

        private Timeline(Builder builder) {
            this.timelineConfig = builder.timelineConfig;
            this.trackList = builder.trackList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeline create() {
            return builder().build();
        }

        /**
         * @return timelineConfig
         */
        public TimelineConfig getTimelineConfig() {
            return this.timelineConfig;
        }

        /**
         * @return trackList
         */
        public TrackList getTrackList() {
            return this.trackList;
        }

        public static final class Builder {
            private TimelineConfig timelineConfig; 
            private TrackList trackList; 

            /**
             * TimelineConfig.
             */
            public Builder timelineConfig(TimelineConfig timelineConfig) {
                this.timelineConfig = timelineConfig;
                return this;
            }

            /**
             * TrackList.
             */
            public Builder trackList(TrackList trackList) {
                this.trackList = trackList;
                return this;
            }

            public Timeline build() {
                return new Timeline(this);
            } 

        } 

    }
    public static class Editing extends TeaModel {
        @NameInMap("ClipList")
        private ClipList clipList;

        @NameInMap("Timeline")
        private Timeline timeline;

        private Editing(Builder builder) {
            this.clipList = builder.clipList;
            this.timeline = builder.timeline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Editing create() {
            return builder().build();
        }

        /**
         * @return clipList
         */
        public ClipList getClipList() {
            return this.clipList;
        }

        /**
         * @return timeline
         */
        public Timeline getTimeline() {
            return this.timeline;
        }

        public static final class Builder {
            private ClipList clipList; 
            private Timeline timeline; 

            /**
             * ClipList.
             */
            public Builder clipList(ClipList clipList) {
                this.clipList = clipList;
                return this;
            }

            /**
             * Timeline.
             */
            public Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            public Editing build() {
                return new Editing(this);
            } 

        } 

    }
    public static class ComplexEditingConfigs extends TeaModel {
        @NameInMap("Editing")
        private Editing editing;

        private ComplexEditingConfigs(Builder builder) {
            this.editing = builder.editing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplexEditingConfigs create() {
            return builder().build();
        }

        /**
         * @return editing
         */
        public Editing getEditing() {
            return this.editing;
        }

        public static final class Builder {
            private Editing editing; 

            /**
             * Editing.
             */
            public Builder editing(Editing editing) {
                this.editing = editing;
                return this;
            }

            public ComplexEditingConfigs build() {
                return new ComplexEditingConfigs(this);
            } 

        } 

    }
    public static class JobComplexEditingConfigs extends TeaModel {
        @NameInMap("ComplexEditingConfigs")
        private java.util.List < ComplexEditingConfigs> complexEditingConfigs;

        private JobComplexEditingConfigs(Builder builder) {
            this.complexEditingConfigs = builder.complexEditingConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobComplexEditingConfigs create() {
            return builder().build();
        }

        /**
         * @return complexEditingConfigs
         */
        public java.util.List < ComplexEditingConfigs> getComplexEditingConfigs() {
            return this.complexEditingConfigs;
        }

        public static final class Builder {
            private java.util.List < ComplexEditingConfigs> complexEditingConfigs; 

            /**
             * ComplexEditingConfigs.
             */
            public Builder complexEditingConfigs(java.util.List < ComplexEditingConfigs> complexEditingConfigs) {
                this.complexEditingConfigs = complexEditingConfigs;
                return this;
            }

            public JobComplexEditingConfigs build() {
                return new JobComplexEditingConfigs(this);
            } 

        } 

    }
    public static class InputConfig extends TeaModel {
        @NameInMap("DeinterlaceMethod")
        private String deinterlaceMethod;

        @NameInMap("IsNormalSar")
        private String isNormalSar;

        private InputConfig(Builder builder) {
            this.deinterlaceMethod = builder.deinterlaceMethod;
            this.isNormalSar = builder.isNormalSar;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputConfig create() {
            return builder().build();
        }

        /**
         * @return deinterlaceMethod
         */
        public String getDeinterlaceMethod() {
            return this.deinterlaceMethod;
        }

        /**
         * @return isNormalSar
         */
        public String getIsNormalSar() {
            return this.isNormalSar;
        }

        public static final class Builder {
            private String deinterlaceMethod; 
            private String isNormalSar; 

            /**
             * DeinterlaceMethod.
             */
            public Builder deinterlaceMethod(String deinterlaceMethod) {
                this.deinterlaceMethod = deinterlaceMethod;
                return this;
            }

            /**
             * IsNormalSar.
             */
            public Builder isNormalSar(String isNormalSar) {
                this.isNormalSar = isNormalSar;
                return this;
            }

            public InputConfig build() {
                return new InputConfig(this);
            } 

        } 

    }
    public static class InputFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private InputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    public static class EditingInput extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("InputConfig")
        private InputConfig inputConfig;

        @NameInMap("InputFile")
        private InputFile inputFile;

        private EditingInput(Builder builder) {
            this.id = builder.id;
            this.inputConfig = builder.inputConfig;
            this.inputFile = builder.inputFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingInput create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inputConfig
         */
        public InputConfig getInputConfig() {
            return this.inputConfig;
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
        }

        public static final class Builder {
            private String id; 
            private InputConfig inputConfig; 
            private InputFile inputFile; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InputConfig.
             */
            public Builder inputConfig(InputConfig inputConfig) {
                this.inputConfig = inputConfig;
                return this;
            }

            /**
             * InputFile.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            public EditingInput build() {
                return new EditingInput(this);
            } 

        } 

    }
    public static class EditingInputs extends TeaModel {
        @NameInMap("EditingInput")
        private java.util.List < EditingInput> editingInput;

        private EditingInputs(Builder builder) {
            this.editingInput = builder.editingInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingInputs create() {
            return builder().build();
        }

        /**
         * @return editingInput
         */
        public java.util.List < EditingInput> getEditingInput() {
            return this.editingInput;
        }

        public static final class Builder {
            private java.util.List < EditingInput> editingInput; 

            /**
             * EditingInput.
             */
            public Builder editingInput(java.util.List < EditingInput> editingInput) {
                this.editingInput = editingInput;
                return this;
            }

            public EditingInputs build() {
                return new EditingInputs(this);
            } 

        } 

    }
    public static class Inputs extends TeaModel {
        @NameInMap("EditingInputs")
        private EditingInputs editingInputs;

        private Inputs(Builder builder) {
            this.editingInputs = builder.editingInputs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return editingInputs
         */
        public EditingInputs getEditingInputs() {
            return this.editingInputs;
        }

        public static final class Builder {
            private EditingInputs editingInputs; 

            /**
             * EditingInputs.
             */
            public Builder editingInputs(EditingInputs editingInputs) {
                this.editingInputs = editingInputs;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    public static class JobInputs extends TeaModel {
        @NameInMap("Inputs")
        private java.util.List < Inputs> inputs;

        private JobInputs(Builder builder) {
            this.inputs = builder.inputs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInputs create() {
            return builder().build();
        }

        /**
         * @return inputs
         */
        public java.util.List < Inputs> getInputs() {
            return this.inputs;
        }

        public static final class Builder {
            private java.util.List < Inputs> inputs; 

            /**
             * Inputs.
             */
            public Builder inputs(java.util.List < Inputs> inputs) {
                this.inputs = inputs;
                return this;
            }

            public JobInputs build() {
                return new JobInputs(this);
            } 

        } 

    }
    public static class MNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("MessageId")
        private String messageId;

        private MNSMessageResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MNSMessageResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String messageId; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            public MNSMessageResult build() {
                return new MNSMessageResult(this);
            } 

        } 

    }
    public static class Volume extends TeaModel {
        @NameInMap("Level")
        private String level;

        @NameInMap("Method")
        private String method;

        private Volume(Builder builder) {
            this.level = builder.level;
            this.method = builder.method;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volume create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        public static final class Builder {
            private String level; 
            private String method; 

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            public Volume build() {
                return new Volume(this);
            } 

        } 

    }
    public static class Audio extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Qscale")
        private String qscale;

        @NameInMap("Samplerate")
        private String samplerate;

        @NameInMap("Volume")
        private Volume volume;

        private Audio(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channels = builder.channels;
            this.codec = builder.codec;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.samplerate = builder.samplerate;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        /**
         * @return volume
         */
        public Volume getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String bitrate; 
            private String channels; 
            private String codec; 
            private String profile; 
            private String qscale; 
            private String samplerate; 
            private Volume volume; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Qscale.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * Samplerate.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Volume volume) {
                this.volume = volume;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    public static class TimeSpan extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        @NameInMap("Seek")
        private String seek;

        private TimeSpan(Builder builder) {
            this.duration = builder.duration;
            this.seek = builder.seek;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSpan create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return seek
         */
        public String getSeek() {
            return this.seek;
        }

        public static final class Builder {
            private String duration; 
            private String seek; 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Seek.
             */
            public Builder seek(String seek) {
                this.seek = seek;
                return this;
            }

            public TimeSpan build() {
                return new TimeSpan(this);
            } 

        } 

    }
    public static class TranscodeOutputClip extends TeaModel {
        @NameInMap("TimeSpan")
        private TimeSpan timeSpan;

        private TranscodeOutputClip(Builder builder) {
            this.timeSpan = builder.timeSpan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeOutputClip create() {
            return builder().build();
        }

        /**
         * @return timeSpan
         */
        public TimeSpan getTimeSpan() {
            return this.timeSpan;
        }

        public static final class Builder {
            private TimeSpan timeSpan; 

            /**
             * TimeSpan.
             */
            public Builder timeSpan(TimeSpan timeSpan) {
                this.timeSpan = timeSpan;
                return this;
            }

            public TranscodeOutputClip build() {
                return new TranscodeOutputClip(this);
            } 

        } 

    }
    public static class Container extends TeaModel {
        @NameInMap("Format")
        private String format;

        private Container(Builder builder) {
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String format; 

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    public static class DigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private DigiWaterMarkInputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DigiWaterMarkInputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public DigiWaterMarkInputFile build() {
                return new DigiWaterMarkInputFile(this);
            } 

        } 

    }
    public static class DigiWaterMark extends TeaModel {
        @NameInMap("Alpha")
        private String alpha;

        @NameInMap("InputFile")
        private DigiWaterMarkInputFile inputFile;

        @NameInMap("Type")
        private String type;

        private DigiWaterMark(Builder builder) {
            this.alpha = builder.alpha;
            this.inputFile = builder.inputFile;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DigiWaterMark create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public String getAlpha() {
            return this.alpha;
        }

        /**
         * @return inputFile
         */
        public DigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String alpha; 
            private DigiWaterMarkInputFile inputFile; 
            private String type; 

            /**
             * Alpha.
             */
            public Builder alpha(String alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * InputFile.
             */
            public Builder inputFile(DigiWaterMarkInputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DigiWaterMark build() {
                return new DigiWaterMark(this);
            } 

        } 

    }
    public static class Encryption extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Key")
        private String key;

        @NameInMap("KeyType")
        private String keyType;

        @NameInMap("KeyUri")
        private String keyUri;

        @NameInMap("SkipCnt")
        private String skipCnt;

        @NameInMap("Type")
        private String type;

        private Encryption(Builder builder) {
            this.id = builder.id;
            this.key = builder.key;
            this.keyType = builder.keyType;
            this.keyUri = builder.keyUri;
            this.skipCnt = builder.skipCnt;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Encryption create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyType
         */
        public String getKeyType() {
            return this.keyType;
        }

        /**
         * @return keyUri
         */
        public String getKeyUri() {
            return this.keyUri;
        }

        /**
         * @return skipCnt
         */
        public String getSkipCnt() {
            return this.skipCnt;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String key; 
            private String keyType; 
            private String keyUri; 
            private String skipCnt; 
            private String type; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(String keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * KeyUri.
             */
            public Builder keyUri(String keyUri) {
                this.keyUri = keyUri;
                return this;
            }

            /**
             * SkipCnt.
             */
            public Builder skipCnt(String skipCnt) {
                this.skipCnt = skipCnt;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Encryption build() {
                return new Encryption(this);
            } 

        } 

    }
    public static class TS extends TeaModel {
        @NameInMap("Md5Support")
        private Boolean md5Support;

        @NameInMap("SizeSupport")
        private Boolean sizeSupport;

        private TS(Builder builder) {
            this.md5Support = builder.md5Support;
            this.sizeSupport = builder.sizeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TS create() {
            return builder().build();
        }

        /**
         * @return md5Support
         */
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        /**
         * @return sizeSupport
         */
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

        public static final class Builder {
            private Boolean md5Support; 
            private Boolean sizeSupport; 

            /**
             * Md5Support.
             */
            public Builder md5Support(Boolean md5Support) {
                this.md5Support = md5Support;
                return this;
            }

            /**
             * SizeSupport.
             */
            public Builder sizeSupport(Boolean sizeSupport) {
                this.sizeSupport = sizeSupport;
                return this;
            }

            public TS build() {
                return new TS(this);
            } 

        } 

    }
    public static class M3U8NonStandardSupport extends TeaModel {
        @NameInMap("TS")
        private TS TS;

        private M3U8NonStandardSupport(Builder builder) {
            this.TS = builder.TS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static M3U8NonStandardSupport create() {
            return builder().build();
        }

        /**
         * @return TS
         */
        public TS getTS() {
            return this.TS;
        }

        public static final class Builder {
            private TS TS; 

            /**
             * TS.
             */
            public Builder TS(TS TS) {
                this.TS = TS;
                return this;
            }

            public M3U8NonStandardSupport build() {
                return new M3U8NonStandardSupport(this);
            } 

        } 

    }
    public static class Merge extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        @NameInMap("MergeURL")
        private String mergeURL;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("Start")
        private String start;

        private Merge(Builder builder) {
            this.duration = builder.duration;
            this.mergeURL = builder.mergeURL;
            this.roleArn = builder.roleArn;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Merge create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return mergeURL
         */
        public String getMergeURL() {
            return this.mergeURL;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String duration; 
            private String mergeURL; 
            private String roleArn; 
            private String start; 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * MergeURL.
             */
            public Builder mergeURL(String mergeURL) {
                this.mergeURL = mergeURL;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public Merge build() {
                return new Merge(this);
            } 

        } 

    }
    public static class MergeList extends TeaModel {
        @NameInMap("Merge")
        private java.util.List < Merge> merge;

        private MergeList(Builder builder) {
            this.merge = builder.merge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MergeList create() {
            return builder().build();
        }

        /**
         * @return merge
         */
        public java.util.List < Merge> getMerge() {
            return this.merge;
        }

        public static final class Builder {
            private java.util.List < Merge> merge; 

            /**
             * Merge.
             */
            public Builder merge(java.util.List < Merge> merge) {
                this.merge = merge;
                return this;
            }

            public MergeList build() {
                return new MergeList(this);
            } 

        } 

    }
    public static class Gif extends TeaModel {
        @NameInMap("DitherMode")
        private String ditherMode;

        @NameInMap("FinalDelay")
        private String finalDelay;

        @NameInMap("IsCustomPalette")
        private String isCustomPalette;

        @NameInMap("Loop")
        private String loop;

        private Gif(Builder builder) {
            this.ditherMode = builder.ditherMode;
            this.finalDelay = builder.finalDelay;
            this.isCustomPalette = builder.isCustomPalette;
            this.loop = builder.loop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gif create() {
            return builder().build();
        }

        /**
         * @return ditherMode
         */
        public String getDitherMode() {
            return this.ditherMode;
        }

        /**
         * @return finalDelay
         */
        public String getFinalDelay() {
            return this.finalDelay;
        }

        /**
         * @return isCustomPalette
         */
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        /**
         * @return loop
         */
        public String getLoop() {
            return this.loop;
        }

        public static final class Builder {
            private String ditherMode; 
            private String finalDelay; 
            private String isCustomPalette; 
            private String loop; 

            /**
             * DitherMode.
             */
            public Builder ditherMode(String ditherMode) {
                this.ditherMode = ditherMode;
                return this;
            }

            /**
             * FinalDelay.
             */
            public Builder finalDelay(String finalDelay) {
                this.finalDelay = finalDelay;
                return this;
            }

            /**
             * IsCustomPalette.
             */
            public Builder isCustomPalette(String isCustomPalette) {
                this.isCustomPalette = isCustomPalette;
                return this;
            }

            /**
             * Loop.
             */
            public Builder loop(String loop) {
                this.loop = loop;
                return this;
            }

            public Gif build() {
                return new Gif(this);
            } 

        } 

    }
    public static class Segment extends TeaModel {
        @NameInMap("Duration")
        private String duration;

        private Segment(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String duration; 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            public Segment build() {
                return new Segment(this);
            } 

        } 

    }
    public static class MuxConfig extends TeaModel {
        @NameInMap("Gif")
        private Gif gif;

        @NameInMap("Segment")
        private Segment segment;

        private MuxConfig(Builder builder) {
            this.gif = builder.gif;
            this.segment = builder.segment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MuxConfig create() {
            return builder().build();
        }

        /**
         * @return gif
         */
        public Gif getGif() {
            return this.gif;
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        public static final class Builder {
            private Gif gif; 
            private Segment segment; 

            /**
             * Gif.
             */
            public Builder gif(Gif gif) {
                this.gif = gif;
                return this;
            }

            /**
             * Segment.
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            public MuxConfig build() {
                return new MuxConfig(this);
            } 

        } 

    }
    public static class OutputFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        @NameInMap("RoleArn")
        private String roleArn;

        private OutputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private String roleArn; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    public static class Format extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FormatLongName")
        private String formatLongName;

        @NameInMap("FormatName")
        private String formatName;

        @NameInMap("NumPrograms")
        private String numPrograms;

        @NameInMap("NumStreams")
        private String numStreams;

        @NameInMap("Size")
        private String size;

        @NameInMap("StartTime")
        private String startTime;

        private Format(Builder builder) {
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.formatLongName = builder.formatLongName;
            this.formatName = builder.formatName;
            this.numPrograms = builder.numPrograms;
            this.numStreams = builder.numStreams;
            this.size = builder.size;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Format create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return formatLongName
         */
        public String getFormatLongName() {
            return this.formatLongName;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return numPrograms
         */
        public String getNumPrograms() {
            return this.numPrograms;
        }

        /**
         * @return numStreams
         */
        public String getNumStreams() {
            return this.numStreams;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String bitrate; 
            private String duration; 
            private String formatLongName; 
            private String formatName; 
            private String numPrograms; 
            private String numStreams; 
            private String size; 
            private String startTime; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FormatLongName.
             */
            public Builder formatLongName(String formatLongName) {
                this.formatLongName = formatLongName;
                return this;
            }

            /**
             * FormatName.
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * NumPrograms.
             */
            public Builder numPrograms(String numPrograms) {
                this.numPrograms = numPrograms;
                return this;
            }

            /**
             * NumStreams.
             */
            public Builder numStreams(String numStreams) {
                this.numStreams = numStreams;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Format build() {
                return new Format(this);
            } 

        } 

    }
    public static class AudioStream extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("ChannelLayout")
        private String channelLayout;

        @NameInMap("Channels")
        private String channels;

        @NameInMap("CodecLongName")
        private String codecLongName;

        @NameInMap("CodecName")
        private String codecName;

        @NameInMap("CodecTag")
        private String codecTag;

        @NameInMap("CodecTagString")
        private String codecTagString;

        @NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Index")
        private String index;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("NumFrames")
        private String numFrames;

        @NameInMap("SampleFmt")
        private String sampleFmt;

        @NameInMap("Samplerate")
        private String samplerate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Timebase")
        private String timebase;

        private AudioStream(Builder builder) {
            this.bitrate = builder.bitrate;
            this.channelLayout = builder.channelLayout;
            this.channels = builder.channels;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.duration = builder.duration;
            this.index = builder.index;
            this.lang = builder.lang;
            this.numFrames = builder.numFrames;
            this.sampleFmt = builder.sampleFmt;
            this.samplerate = builder.samplerate;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStream create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return channelLayout
         */
        public String getChannelLayout() {
            return this.channelLayout;
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return numFrames
         */
        public String getNumFrames() {
            return this.numFrames;
        }

        /**
         * @return sampleFmt
         */
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        /**
         * @return samplerate
         */
        public String getSamplerate() {
            return this.samplerate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timebase
         */
        public String getTimebase() {
            return this.timebase;
        }

        public static final class Builder {
            private String bitrate; 
            private String channelLayout; 
            private String channels; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String duration; 
            private String index; 
            private String lang; 
            private String numFrames; 
            private String sampleFmt; 
            private String samplerate; 
            private String startTime; 
            private String timebase; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * ChannelLayout.
             */
            public Builder channelLayout(String channelLayout) {
                this.channelLayout = channelLayout;
                return this;
            }

            /**
             * Channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * NumFrames.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * SampleFmt.
             */
            public Builder sampleFmt(String sampleFmt) {
                this.sampleFmt = sampleFmt;
                return this;
            }

            /**
             * Samplerate.
             */
            public Builder samplerate(String samplerate) {
                this.samplerate = samplerate;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Timebase.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            public AudioStream build() {
                return new AudioStream(this);
            } 

        } 

    }
    public static class AudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        private java.util.List < AudioStream> audioStream;

        private AudioStreamList(Builder builder) {
            this.audioStream = builder.audioStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioStreamList create() {
            return builder().build();
        }

        /**
         * @return audioStream
         */
        public java.util.List < AudioStream> getAudioStream() {
            return this.audioStream;
        }

        public static final class Builder {
            private java.util.List < AudioStream> audioStream; 

            /**
             * AudioStream.
             */
            public Builder audioStream(java.util.List < AudioStream> audioStream) {
                this.audioStream = audioStream;
                return this;
            }

            public AudioStreamList build() {
                return new AudioStreamList(this);
            } 

        } 

    }
    public static class SubtitleStream extends TeaModel {
        @NameInMap("Index")
        private String index;

        @NameInMap("Lang")
        private String lang;

        private SubtitleStream(Builder builder) {
            this.index = builder.index;
            this.lang = builder.lang;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStream create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        public static final class Builder {
            private String index; 
            private String lang; 

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            public SubtitleStream build() {
                return new SubtitleStream(this);
            } 

        } 

    }
    public static class SubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        private java.util.List < SubtitleStream> subtitleStream;

        private SubtitleStreamList(Builder builder) {
            this.subtitleStream = builder.subtitleStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStreamList create() {
            return builder().build();
        }

        /**
         * @return subtitleStream
         */
        public java.util.List < SubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

        public static final class Builder {
            private java.util.List < SubtitleStream> subtitleStream; 

            /**
             * SubtitleStream.
             */
            public Builder subtitleStream(java.util.List < SubtitleStream> subtitleStream) {
                this.subtitleStream = subtitleStream;
                return this;
            }

            public SubtitleStreamList build() {
                return new SubtitleStreamList(this);
            } 

        } 

    }
    public static class NetworkCost extends TeaModel {
        @NameInMap("AvgBitrate")
        private String avgBitrate;

        @NameInMap("CostBandwidth")
        private String costBandwidth;

        @NameInMap("PreloadTime")
        private String preloadTime;

        private NetworkCost(Builder builder) {
            this.avgBitrate = builder.avgBitrate;
            this.costBandwidth = builder.costBandwidth;
            this.preloadTime = builder.preloadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCost create() {
            return builder().build();
        }

        /**
         * @return avgBitrate
         */
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        /**
         * @return costBandwidth
         */
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        /**
         * @return preloadTime
         */
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public static final class Builder {
            private String avgBitrate; 
            private String costBandwidth; 
            private String preloadTime; 

            /**
             * AvgBitrate.
             */
            public Builder avgBitrate(String avgBitrate) {
                this.avgBitrate = avgBitrate;
                return this;
            }

            /**
             * CostBandwidth.
             */
            public Builder costBandwidth(String costBandwidth) {
                this.costBandwidth = costBandwidth;
                return this;
            }

            /**
             * PreloadTime.
             */
            public Builder preloadTime(String preloadTime) {
                this.preloadTime = preloadTime;
                return this;
            }

            public NetworkCost build() {
                return new NetworkCost(this);
            } 

        } 

    }
    public static class VideoStream extends TeaModel {
        @NameInMap("AvgFPS")
        private String avgFPS;

        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("CodecLongName")
        private String codecLongName;

        @NameInMap("CodecName")
        private String codecName;

        @NameInMap("CodecTag")
        private String codecTag;

        @NameInMap("CodecTagString")
        private String codecTagString;

        @NameInMap("CodecTimeBase")
        private String codecTimeBase;

        @NameInMap("Dar")
        private String dar;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("HasBFrames")
        private String hasBFrames;

        @NameInMap("Height")
        private String height;

        @NameInMap("Index")
        private String index;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("Level")
        private String level;

        @NameInMap("NetworkCost")
        private NetworkCost networkCost;

        @NameInMap("NumFrames")
        private String numFrames;

        @NameInMap("PixFmt")
        private String pixFmt;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Sar")
        private String sar;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Timebase")
        private String timebase;

        @NameInMap("Width")
        private String width;

        private VideoStream(Builder builder) {
            this.avgFPS = builder.avgFPS;
            this.bitrate = builder.bitrate;
            this.codecLongName = builder.codecLongName;
            this.codecName = builder.codecName;
            this.codecTag = builder.codecTag;
            this.codecTagString = builder.codecTagString;
            this.codecTimeBase = builder.codecTimeBase;
            this.dar = builder.dar;
            this.duration = builder.duration;
            this.fps = builder.fps;
            this.hasBFrames = builder.hasBFrames;
            this.height = builder.height;
            this.index = builder.index;
            this.lang = builder.lang;
            this.level = builder.level;
            this.networkCost = builder.networkCost;
            this.numFrames = builder.numFrames;
            this.pixFmt = builder.pixFmt;
            this.profile = builder.profile;
            this.sar = builder.sar;
            this.startTime = builder.startTime;
            this.timebase = builder.timebase;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStream create() {
            return builder().build();
        }

        /**
         * @return avgFPS
         */
        public String getAvgFPS() {
            return this.avgFPS;
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return codecLongName
         */
        public String getCodecLongName() {
            return this.codecLongName;
        }

        /**
         * @return codecName
         */
        public String getCodecName() {
            return this.codecName;
        }

        /**
         * @return codecTag
         */
        public String getCodecTag() {
            return this.codecTag;
        }

        /**
         * @return codecTagString
         */
        public String getCodecTagString() {
            return this.codecTagString;
        }

        /**
         * @return codecTimeBase
         */
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        /**
         * @return dar
         */
        public String getDar() {
            return this.dar;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return hasBFrames
         */
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return networkCost
         */
        public NetworkCost getNetworkCost() {
            return this.networkCost;
        }

        /**
         * @return numFrames
         */
        public String getNumFrames() {
            return this.numFrames;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return sar
         */
        public String getSar() {
            return this.sar;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timebase
         */
        public String getTimebase() {
            return this.timebase;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String avgFPS; 
            private String bitrate; 
            private String codecLongName; 
            private String codecName; 
            private String codecTag; 
            private String codecTagString; 
            private String codecTimeBase; 
            private String dar; 
            private String duration; 
            private String fps; 
            private String hasBFrames; 
            private String height; 
            private String index; 
            private String lang; 
            private String level; 
            private NetworkCost networkCost; 
            private String numFrames; 
            private String pixFmt; 
            private String profile; 
            private String sar; 
            private String startTime; 
            private String timebase; 
            private String width; 

            /**
             * AvgFPS.
             */
            public Builder avgFPS(String avgFPS) {
                this.avgFPS = avgFPS;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * CodecLongName.
             */
            public Builder codecLongName(String codecLongName) {
                this.codecLongName = codecLongName;
                return this;
            }

            /**
             * CodecName.
             */
            public Builder codecName(String codecName) {
                this.codecName = codecName;
                return this;
            }

            /**
             * CodecTag.
             */
            public Builder codecTag(String codecTag) {
                this.codecTag = codecTag;
                return this;
            }

            /**
             * CodecTagString.
             */
            public Builder codecTagString(String codecTagString) {
                this.codecTagString = codecTagString;
                return this;
            }

            /**
             * CodecTimeBase.
             */
            public Builder codecTimeBase(String codecTimeBase) {
                this.codecTimeBase = codecTimeBase;
                return this;
            }

            /**
             * Dar.
             */
            public Builder dar(String dar) {
                this.dar = dar;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * HasBFrames.
             */
            public Builder hasBFrames(String hasBFrames) {
                this.hasBFrames = hasBFrames;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * NetworkCost.
             */
            public Builder networkCost(NetworkCost networkCost) {
                this.networkCost = networkCost;
                return this;
            }

            /**
             * NumFrames.
             */
            public Builder numFrames(String numFrames) {
                this.numFrames = numFrames;
                return this;
            }

            /**
             * PixFmt.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Sar.
             */
            public Builder sar(String sar) {
                this.sar = sar;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Timebase.
             */
            public Builder timebase(String timebase) {
                this.timebase = timebase;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public VideoStream build() {
                return new VideoStream(this);
            } 

        } 

    }
    public static class VideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        private java.util.List < VideoStream> videoStream;

        private VideoStreamList(Builder builder) {
            this.videoStream = builder.videoStream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoStreamList create() {
            return builder().build();
        }

        /**
         * @return videoStream
         */
        public java.util.List < VideoStream> getVideoStream() {
            return this.videoStream;
        }

        public static final class Builder {
            private java.util.List < VideoStream> videoStream; 

            /**
             * VideoStream.
             */
            public Builder videoStream(java.util.List < VideoStream> videoStream) {
                this.videoStream = videoStream;
                return this;
            }

            public VideoStreamList build() {
                return new VideoStreamList(this);
            } 

        } 

    }
    public static class Streams extends TeaModel {
        @NameInMap("AudioStreamList")
        private AudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        private SubtitleStreamList subtitleStreamList;

        @NameInMap("VideoStreamList")
        private VideoStreamList videoStreamList;

        private Streams(Builder builder) {
            this.audioStreamList = builder.audioStreamList;
            this.subtitleStreamList = builder.subtitleStreamList;
            this.videoStreamList = builder.videoStreamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Streams create() {
            return builder().build();
        }

        /**
         * @return audioStreamList
         */
        public AudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        /**
         * @return subtitleStreamList
         */
        public SubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        /**
         * @return videoStreamList
         */
        public VideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public static final class Builder {
            private AudioStreamList audioStreamList; 
            private SubtitleStreamList subtitleStreamList; 
            private VideoStreamList videoStreamList; 

            /**
             * AudioStreamList.
             */
            public Builder audioStreamList(AudioStreamList audioStreamList) {
                this.audioStreamList = audioStreamList;
                return this;
            }

            /**
             * SubtitleStreamList.
             */
            public Builder subtitleStreamList(SubtitleStreamList subtitleStreamList) {
                this.subtitleStreamList = subtitleStreamList;
                return this;
            }

            /**
             * VideoStreamList.
             */
            public Builder videoStreamList(VideoStreamList videoStreamList) {
                this.videoStreamList = videoStreamList;
                return this;
            }

            public Streams build() {
                return new Streams(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("FileFormat")
        private String fileFormat;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("Format")
        private Format format;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Height")
        private String height;

        @NameInMap("Streams")
        private Streams streams;

        @NameInMap("Width")
        private String width;

        private Properties(Builder builder) {
            this.bitrate = builder.bitrate;
            this.duration = builder.duration;
            this.fileFormat = builder.fileFormat;
            this.fileSize = builder.fileSize;
            this.format = builder.format;
            this.fps = builder.fps;
            this.height = builder.height;
            this.streams = builder.streams;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return format
         */
        public Format getFormat() {
            return this.format;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return streams
         */
        public Streams getStreams() {
            return this.streams;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private String duration; 
            private String fileFormat; 
            private String fileSize; 
            private Format format; 
            private String fps; 
            private String height; 
            private Streams streams; 
            private String width; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileFormat.
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(Format format) {
                this.format = format;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Streams.
             */
            public Builder streams(Streams streams) {
                this.streams = streams;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private Input(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class ExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        private String charEnc;

        @NameInMap("FontName")
        private String fontName;

        @NameInMap("Input")
        private Input input;

        private ExtSubtitle(Builder builder) {
            this.charEnc = builder.charEnc;
            this.fontName = builder.fontName;
            this.input = builder.input;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtSubtitle create() {
            return builder().build();
        }

        /**
         * @return charEnc
         */
        public String getCharEnc() {
            return this.charEnc;
        }

        /**
         * @return fontName
         */
        public String getFontName() {
            return this.fontName;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        public static final class Builder {
            private String charEnc; 
            private String fontName; 
            private Input input; 

            /**
             * CharEnc.
             */
            public Builder charEnc(String charEnc) {
                this.charEnc = charEnc;
                return this;
            }

            /**
             * FontName.
             */
            public Builder fontName(String fontName) {
                this.fontName = fontName;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            public ExtSubtitle build() {
                return new ExtSubtitle(this);
            } 

        } 

    }
    public static class ExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        private java.util.List < ExtSubtitle> extSubtitle;

        private ExtSubtitleList(Builder builder) {
            this.extSubtitle = builder.extSubtitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtSubtitleList create() {
            return builder().build();
        }

        /**
         * @return extSubtitle
         */
        public java.util.List < ExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

        public static final class Builder {
            private java.util.List < ExtSubtitle> extSubtitle; 

            /**
             * ExtSubtitle.
             */
            public Builder extSubtitle(java.util.List < ExtSubtitle> extSubtitle) {
                this.extSubtitle = extSubtitle;
                return this;
            }

            public ExtSubtitleList build() {
                return new ExtSubtitleList(this);
            } 

        } 

    }
    public static class Subtitle extends TeaModel {
        @NameInMap("Map")
        private String map;

        private Subtitle(Builder builder) {
            this.map = builder.map;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subtitle create() {
            return builder().build();
        }

        /**
         * @return map
         */
        public String getMap() {
            return this.map;
        }

        public static final class Builder {
            private String map; 

            /**
             * Map.
             */
            public Builder map(String map) {
                this.map = map;
                return this;
            }

            public Subtitle build() {
                return new Subtitle(this);
            } 

        } 

    }
    public static class SubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        private java.util.List < Subtitle> subtitle;

        private SubtitleList(Builder builder) {
            this.subtitle = builder.subtitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleList create() {
            return builder().build();
        }

        /**
         * @return subtitle
         */
        public java.util.List < Subtitle> getSubtitle() {
            return this.subtitle;
        }

        public static final class Builder {
            private java.util.List < Subtitle> subtitle; 

            /**
             * Subtitle.
             */
            public Builder subtitle(java.util.List < Subtitle> subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public SubtitleList build() {
                return new SubtitleList(this);
            } 

        } 

    }
    public static class SubtitleConfig extends TeaModel {
        @NameInMap("ExtSubtitleList")
        private ExtSubtitleList extSubtitleList;

        @NameInMap("SubtitleList")
        private SubtitleList subtitleList;

        private SubtitleConfig(Builder builder) {
            this.extSubtitleList = builder.extSubtitleList;
            this.subtitleList = builder.subtitleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleConfig create() {
            return builder().build();
        }

        /**
         * @return extSubtitleList
         */
        public ExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        /**
         * @return subtitleList
         */
        public SubtitleList getSubtitleList() {
            return this.subtitleList;
        }

        public static final class Builder {
            private ExtSubtitleList extSubtitleList; 
            private SubtitleList subtitleList; 

            /**
             * ExtSubtitleList.
             */
            public Builder extSubtitleList(ExtSubtitleList extSubtitleList) {
                this.extSubtitleList = extSubtitleList;
                return this;
            }

            /**
             * SubtitleList.
             */
            public Builder subtitleList(SubtitleList subtitleList) {
                this.subtitleList = subtitleList;
                return this;
            }

            public SubtitleConfig build() {
                return new SubtitleConfig(this);
            } 

        } 

    }
    public static class SuperReso extends TeaModel {
        @NameInMap("IsHalfSample")
        private String isHalfSample;

        private SuperReso(Builder builder) {
            this.isHalfSample = builder.isHalfSample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuperReso create() {
            return builder().build();
        }

        /**
         * @return isHalfSample
         */
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

        public static final class Builder {
            private String isHalfSample; 

            /**
             * IsHalfSample.
             */
            public Builder isHalfSample(String isHalfSample) {
                this.isHalfSample = isHalfSample;
                return this;
            }

            public SuperReso build() {
                return new SuperReso(this);
            } 

        } 

    }
    public static class TransConfig extends TeaModel {
        @NameInMap("AdjDarMethod")
        private String adjDarMethod;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("IsCheckAudioBitrate")
        private String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        private String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        private String isCheckReso;

        @NameInMap("IsCheckResoFail")
        private String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        private String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        private String isCheckVideoBitrateFail;

        @NameInMap("TransMode")
        private String transMode;

        private TransConfig(Builder builder) {
            this.adjDarMethod = builder.adjDarMethod;
            this.duration = builder.duration;
            this.isCheckAudioBitrate = builder.isCheckAudioBitrate;
            this.isCheckAudioBitrateFail = builder.isCheckAudioBitrateFail;
            this.isCheckReso = builder.isCheckReso;
            this.isCheckResoFail = builder.isCheckResoFail;
            this.isCheckVideoBitrate = builder.isCheckVideoBitrate;
            this.isCheckVideoBitrateFail = builder.isCheckVideoBitrateFail;
            this.transMode = builder.transMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfig create() {
            return builder().build();
        }

        /**
         * @return adjDarMethod
         */
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return isCheckAudioBitrate
         */
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        /**
         * @return isCheckAudioBitrateFail
         */
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        /**
         * @return isCheckReso
         */
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        /**
         * @return isCheckResoFail
         */
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        /**
         * @return isCheckVideoBitrate
         */
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        /**
         * @return isCheckVideoBitrateFail
         */
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        /**
         * @return transMode
         */
        public String getTransMode() {
            return this.transMode;
        }

        public static final class Builder {
            private String adjDarMethod; 
            private String duration; 
            private String isCheckAudioBitrate; 
            private String isCheckAudioBitrateFail; 
            private String isCheckReso; 
            private String isCheckResoFail; 
            private String isCheckVideoBitrate; 
            private String isCheckVideoBitrateFail; 
            private String transMode; 

            /**
             * AdjDarMethod.
             */
            public Builder adjDarMethod(String adjDarMethod) {
                this.adjDarMethod = adjDarMethod;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * IsCheckAudioBitrate.
             */
            public Builder isCheckAudioBitrate(String isCheckAudioBitrate) {
                this.isCheckAudioBitrate = isCheckAudioBitrate;
                return this;
            }

            /**
             * IsCheckAudioBitrateFail.
             */
            public Builder isCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
                this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
                return this;
            }

            /**
             * IsCheckReso.
             */
            public Builder isCheckReso(String isCheckReso) {
                this.isCheckReso = isCheckReso;
                return this;
            }

            /**
             * IsCheckResoFail.
             */
            public Builder isCheckResoFail(String isCheckResoFail) {
                this.isCheckResoFail = isCheckResoFail;
                return this;
            }

            /**
             * IsCheckVideoBitrate.
             */
            public Builder isCheckVideoBitrate(String isCheckVideoBitrate) {
                this.isCheckVideoBitrate = isCheckVideoBitrate;
                return this;
            }

            /**
             * IsCheckVideoBitrateFail.
             */
            public Builder isCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
                this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
                return this;
            }

            /**
             * TransMode.
             */
            public Builder transMode(String transMode) {
                this.transMode = transMode;
                return this;
            }

            public TransConfig build() {
                return new TransConfig(this);
            } 

        } 

    }
    public static class BitrateBnd extends TeaModel {
        @NameInMap("Max")
        private String max;

        @NameInMap("Min")
        private String min;

        private BitrateBnd(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BitrateBnd create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public String getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public String getMin() {
            return this.min;
        }

        public static final class Builder {
            private String max; 
            private String min; 

            /**
             * Max.
             */
            public Builder max(String max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(String min) {
                this.min = min;
                return this;
            }

            public BitrateBnd build() {
                return new BitrateBnd(this);
            } 

        } 

    }
    public static class Video extends TeaModel {
        @NameInMap("Bitrate")
        private String bitrate;

        @NameInMap("BitrateBnd")
        private BitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        private String bufsize;

        @NameInMap("Codec")
        private String codec;

        @NameInMap("Crf")
        private String crf;

        @NameInMap("Crop")
        private String crop;

        @NameInMap("Degrain")
        private String degrain;

        @NameInMap("Fps")
        private String fps;

        @NameInMap("Gop")
        private String gop;

        @NameInMap("Height")
        private String height;

        @NameInMap("MaxFps")
        private String maxFps;

        @NameInMap("Maxrate")
        private String maxrate;

        @NameInMap("Pad")
        private String pad;

        @NameInMap("PixFmt")
        private String pixFmt;

        @NameInMap("Preset")
        private String preset;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Qscale")
        private String qscale;

        @NameInMap("ScanMode")
        private String scanMode;

        @NameInMap("Width")
        private String width;

        private Video(Builder builder) {
            this.bitrate = builder.bitrate;
            this.bitrateBnd = builder.bitrateBnd;
            this.bufsize = builder.bufsize;
            this.codec = builder.codec;
            this.crf = builder.crf;
            this.crop = builder.crop;
            this.degrain = builder.degrain;
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.maxFps = builder.maxFps;
            this.maxrate = builder.maxrate;
            this.pad = builder.pad;
            this.pixFmt = builder.pixFmt;
            this.preset = builder.preset;
            this.profile = builder.profile;
            this.qscale = builder.qscale;
            this.scanMode = builder.scanMode;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return bitrate
         */
        public String getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bitrateBnd
         */
        public BitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        /**
         * @return bufsize
         */
        public String getBufsize() {
            return this.bufsize;
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return crf
         */
        public String getCrf() {
            return this.crf;
        }

        /**
         * @return crop
         */
        public String getCrop() {
            return this.crop;
        }

        /**
         * @return degrain
         */
        public String getDegrain() {
            return this.degrain;
        }

        /**
         * @return fps
         */
        public String getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public String getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return maxFps
         */
        public String getMaxFps() {
            return this.maxFps;
        }

        /**
         * @return maxrate
         */
        public String getMaxrate() {
            return this.maxrate;
        }

        /**
         * @return pad
         */
        public String getPad() {
            return this.pad;
        }

        /**
         * @return pixFmt
         */
        public String getPixFmt() {
            return this.pixFmt;
        }

        /**
         * @return preset
         */
        public String getPreset() {
            return this.preset;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return qscale
         */
        public String getQscale() {
            return this.qscale;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String bitrate; 
            private BitrateBnd bitrateBnd; 
            private String bufsize; 
            private String codec; 
            private String crf; 
            private String crop; 
            private String degrain; 
            private String fps; 
            private String gop; 
            private String height; 
            private String maxFps; 
            private String maxrate; 
            private String pad; 
            private String pixFmt; 
            private String preset; 
            private String profile; 
            private String qscale; 
            private String scanMode; 
            private String width; 

            /**
             * Bitrate.
             */
            public Builder bitrate(String bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * BitrateBnd.
             */
            public Builder bitrateBnd(BitrateBnd bitrateBnd) {
                this.bitrateBnd = bitrateBnd;
                return this;
            }

            /**
             * Bufsize.
             */
            public Builder bufsize(String bufsize) {
                this.bufsize = bufsize;
                return this;
            }

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Crf.
             */
            public Builder crf(String crf) {
                this.crf = crf;
                return this;
            }

            /**
             * Crop.
             */
            public Builder crop(String crop) {
                this.crop = crop;
                return this;
            }

            /**
             * Degrain.
             */
            public Builder degrain(String degrain) {
                this.degrain = degrain;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(String fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Gop.
             */
            public Builder gop(String gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * MaxFps.
             */
            public Builder maxFps(String maxFps) {
                this.maxFps = maxFps;
                return this;
            }

            /**
             * Maxrate.
             */
            public Builder maxrate(String maxrate) {
                this.maxrate = maxrate;
                return this;
            }

            /**
             * Pad.
             */
            public Builder pad(String pad) {
                this.pad = pad;
                return this;
            }

            /**
             * PixFmt.
             */
            public Builder pixFmt(String pixFmt) {
                this.pixFmt = pixFmt;
                return this;
            }

            /**
             * Preset.
             */
            public Builder preset(String preset) {
                this.preset = preset;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * Qscale.
             */
            public Builder qscale(String qscale) {
                this.qscale = qscale;
                return this;
            }

            /**
             * ScanMode.
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    public static class WaterMarkInputFile extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        private WaterMarkInputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMarkInputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public WaterMarkInputFile build() {
                return new WaterMarkInputFile(this);
            } 

        } 

    }
    public static class WaterMark extends TeaModel {
        @NameInMap("Dx")
        private String dx;

        @NameInMap("Dy")
        private String dy;

        @NameInMap("Height")
        private String height;

        @NameInMap("InputFile")
        private WaterMarkInputFile inputFile;

        @NameInMap("ReferPos")
        private String referPos;

        @NameInMap("Type")
        private String type;

        @NameInMap("WaterMarkTemplateId")
        private String waterMarkTemplateId;

        @NameInMap("Width")
        private String width;

        private WaterMark(Builder builder) {
            this.dx = builder.dx;
            this.dy = builder.dy;
            this.height = builder.height;
            this.inputFile = builder.inputFile;
            this.referPos = builder.referPos;
            this.type = builder.type;
            this.waterMarkTemplateId = builder.waterMarkTemplateId;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMark create() {
            return builder().build();
        }

        /**
         * @return dx
         */
        public String getDx() {
            return this.dx;
        }

        /**
         * @return dy
         */
        public String getDy() {
            return this.dy;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return inputFile
         */
        public WaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return referPos
         */
        public String getReferPos() {
            return this.referPos;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return waterMarkTemplateId
         */
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String dx; 
            private String dy; 
            private String height; 
            private WaterMarkInputFile inputFile; 
            private String referPos; 
            private String type; 
            private String waterMarkTemplateId; 
            private String width; 

            /**
             * Dx.
             */
            public Builder dx(String dx) {
                this.dx = dx;
                return this;
            }

            /**
             * Dy.
             */
            public Builder dy(String dy) {
                this.dy = dy;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * InputFile.
             */
            public Builder inputFile(WaterMarkInputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * ReferPos.
             */
            public Builder referPos(String referPos) {
                this.referPos = referPos;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * WaterMarkTemplateId.
             */
            public Builder waterMarkTemplateId(String waterMarkTemplateId) {
                this.waterMarkTemplateId = waterMarkTemplateId;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public WaterMark build() {
                return new WaterMark(this);
            } 

        } 

    }
    public static class WaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        private java.util.List < WaterMark> waterMark;

        private WaterMarkList(Builder builder) {
            this.waterMark = builder.waterMark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WaterMarkList create() {
            return builder().build();
        }

        /**
         * @return waterMark
         */
        public java.util.List < WaterMark> getWaterMark() {
            return this.waterMark;
        }

        public static final class Builder {
            private java.util.List < WaterMark> waterMark; 

            /**
             * WaterMark.
             */
            public Builder waterMark(java.util.List < WaterMark> waterMark) {
                this.waterMark = waterMark;
                return this;
            }

            public WaterMarkList build() {
                return new WaterMarkList(this);
            } 

        } 

    }
    public static class TranscodeOutput extends TeaModel {
        @NameInMap("Audio")
        private Audio audio;

        @NameInMap("AudioStreamMap")
        private String audioStreamMap;

        @NameInMap("Clip")
        private TranscodeOutputClip clip;

        @NameInMap("Container")
        private Container container;

        @NameInMap("DeWatermark")
        private String deWatermark;

        @NameInMap("DigiWaterMark")
        private DigiWaterMark digiWaterMark;

        @NameInMap("Encryption")
        private Encryption encryption;

        @NameInMap("M3U8NonStandardSupport")
        private M3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("MergeConfigUrl")
        private String mergeConfigUrl;

        @NameInMap("MergeList")
        private MergeList mergeList;

        @NameInMap("MuxConfig")
        private MuxConfig muxConfig;

        @NameInMap("OutputFile")
        private OutputFile outputFile;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Properties")
        private Properties properties;

        @NameInMap("Rotate")
        private String rotate;

        @NameInMap("SubtitleConfig")
        private SubtitleConfig subtitleConfig;

        @NameInMap("SuperReso")
        private SuperReso superReso;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TransConfig")
        private TransConfig transConfig;

        @NameInMap("UserData")
        private String userData;

        @NameInMap("Video")
        private Video video;

        @NameInMap("VideoStreamMap")
        private String videoStreamMap;

        @NameInMap("WaterMarkConfigUrl")
        private String waterMarkConfigUrl;

        @NameInMap("WaterMarkList")
        private WaterMarkList waterMarkList;

        private TranscodeOutput(Builder builder) {
            this.audio = builder.audio;
            this.audioStreamMap = builder.audioStreamMap;
            this.clip = builder.clip;
            this.container = builder.container;
            this.deWatermark = builder.deWatermark;
            this.digiWaterMark = builder.digiWaterMark;
            this.encryption = builder.encryption;
            this.m3U8NonStandardSupport = builder.m3U8NonStandardSupport;
            this.mergeConfigUrl = builder.mergeConfigUrl;
            this.mergeList = builder.mergeList;
            this.muxConfig = builder.muxConfig;
            this.outputFile = builder.outputFile;
            this.priority = builder.priority;
            this.properties = builder.properties;
            this.rotate = builder.rotate;
            this.subtitleConfig = builder.subtitleConfig;
            this.superReso = builder.superReso;
            this.templateId = builder.templateId;
            this.transConfig = builder.transConfig;
            this.userData = builder.userData;
            this.video = builder.video;
            this.videoStreamMap = builder.videoStreamMap;
            this.waterMarkConfigUrl = builder.waterMarkConfigUrl;
            this.waterMarkList = builder.waterMarkList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeOutput create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return audioStreamMap
         */
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        /**
         * @return clip
         */
        public TranscodeOutputClip getClip() {
            return this.clip;
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return deWatermark
         */
        public String getDeWatermark() {
            return this.deWatermark;
        }

        /**
         * @return digiWaterMark
         */
        public DigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        /**
         * @return encryption
         */
        public Encryption getEncryption() {
            return this.encryption;
        }

        /**
         * @return m3U8NonStandardSupport
         */
        public M3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        /**
         * @return mergeConfigUrl
         */
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        /**
         * @return mergeList
         */
        public MergeList getMergeList() {
            return this.mergeList;
        }

        /**
         * @return muxConfig
         */
        public MuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return rotate
         */
        public String getRotate() {
            return this.rotate;
        }

        /**
         * @return subtitleConfig
         */
        public SubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        /**
         * @return superReso
         */
        public SuperReso getSuperReso() {
            return this.superReso;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return transConfig
         */
        public TransConfig getTransConfig() {
            return this.transConfig;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        /**
         * @return videoStreamMap
         */
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        /**
         * @return waterMarkConfigUrl
         */
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        /**
         * @return waterMarkList
         */
        public WaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

        public static final class Builder {
            private Audio audio; 
            private String audioStreamMap; 
            private TranscodeOutputClip clip; 
            private Container container; 
            private String deWatermark; 
            private DigiWaterMark digiWaterMark; 
            private Encryption encryption; 
            private M3U8NonStandardSupport m3U8NonStandardSupport; 
            private String mergeConfigUrl; 
            private MergeList mergeList; 
            private MuxConfig muxConfig; 
            private OutputFile outputFile; 
            private String priority; 
            private Properties properties; 
            private String rotate; 
            private SubtitleConfig subtitleConfig; 
            private SuperReso superReso; 
            private String templateId; 
            private TransConfig transConfig; 
            private String userData; 
            private Video video; 
            private String videoStreamMap; 
            private String waterMarkConfigUrl; 
            private WaterMarkList waterMarkList; 

            /**
             * Audio.
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * AudioStreamMap.
             */
            public Builder audioStreamMap(String audioStreamMap) {
                this.audioStreamMap = audioStreamMap;
                return this;
            }

            /**
             * Clip.
             */
            public Builder clip(TranscodeOutputClip clip) {
                this.clip = clip;
                return this;
            }

            /**
             * Container.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * DeWatermark.
             */
            public Builder deWatermark(String deWatermark) {
                this.deWatermark = deWatermark;
                return this;
            }

            /**
             * DigiWaterMark.
             */
            public Builder digiWaterMark(DigiWaterMark digiWaterMark) {
                this.digiWaterMark = digiWaterMark;
                return this;
            }

            /**
             * Encryption.
             */
            public Builder encryption(Encryption encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * M3U8NonStandardSupport.
             */
            public Builder m3U8NonStandardSupport(M3U8NonStandardSupport m3U8NonStandardSupport) {
                this.m3U8NonStandardSupport = m3U8NonStandardSupport;
                return this;
            }

            /**
             * MergeConfigUrl.
             */
            public Builder mergeConfigUrl(String mergeConfigUrl) {
                this.mergeConfigUrl = mergeConfigUrl;
                return this;
            }

            /**
             * MergeList.
             */
            public Builder mergeList(MergeList mergeList) {
                this.mergeList = mergeList;
                return this;
            }

            /**
             * MuxConfig.
             */
            public Builder muxConfig(MuxConfig muxConfig) {
                this.muxConfig = muxConfig;
                return this;
            }

            /**
             * OutputFile.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Rotate.
             */
            public Builder rotate(String rotate) {
                this.rotate = rotate;
                return this;
            }

            /**
             * SubtitleConfig.
             */
            public Builder subtitleConfig(SubtitleConfig subtitleConfig) {
                this.subtitleConfig = subtitleConfig;
                return this;
            }

            /**
             * SuperReso.
             */
            public Builder superReso(SuperReso superReso) {
                this.superReso = superReso;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TransConfig.
             */
            public Builder transConfig(TransConfig transConfig) {
                this.transConfig = transConfig;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            /**
             * Video.
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            /**
             * VideoStreamMap.
             */
            public Builder videoStreamMap(String videoStreamMap) {
                this.videoStreamMap = videoStreamMap;
                return this;
            }

            /**
             * WaterMarkConfigUrl.
             */
            public Builder waterMarkConfigUrl(String waterMarkConfigUrl) {
                this.waterMarkConfigUrl = waterMarkConfigUrl;
                return this;
            }

            /**
             * WaterMarkList.
             */
            public Builder waterMarkList(WaterMarkList waterMarkList) {
                this.waterMarkList = waterMarkList;
                return this;
            }

            public TranscodeOutput build() {
                return new TranscodeOutput(this);
            } 

        } 

    }
    public static class Job extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("ComplexEditingConfigs")
        private JobComplexEditingConfigs complexEditingConfigs;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Inputs")
        private JobInputs inputs;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        private String message;

        @NameInMap("Percent")
        private Long percent;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("State")
        private String state;

        @NameInMap("transcodeOutput")
        private TranscodeOutput transcodeOutput;

        private Job(Builder builder) {
            this.code = builder.code;
            this.complexEditingConfigs = builder.complexEditingConfigs;
            this.creationTime = builder.creationTime;
            this.finishTime = builder.finishTime;
            this.inputs = builder.inputs;
            this.jobId = builder.jobId;
            this.MNSMessageResult = builder.MNSMessageResult;
            this.message = builder.message;
            this.percent = builder.percent;
            this.pipelineId = builder.pipelineId;
            this.state = builder.state;
            this.transcodeOutput = builder.transcodeOutput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return complexEditingConfigs
         */
        public JobComplexEditingConfigs getComplexEditingConfigs() {
            return this.complexEditingConfigs;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return inputs
         */
        public JobInputs getInputs() {
            return this.inputs;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return MNSMessageResult
         */
        public MNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Long getPercent() {
            return this.percent;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return transcodeOutput
         */
        public TranscodeOutput getTranscodeOutput() {
            return this.transcodeOutput;
        }

        public static final class Builder {
            private String code; 
            private JobComplexEditingConfigs complexEditingConfigs; 
            private String creationTime; 
            private String finishTime; 
            private JobInputs inputs; 
            private String jobId; 
            private MNSMessageResult MNSMessageResult; 
            private String message; 
            private Long percent; 
            private String pipelineId; 
            private String state; 
            private TranscodeOutput transcodeOutput; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ComplexEditingConfigs.
             */
            public Builder complexEditingConfigs(JobComplexEditingConfigs complexEditingConfigs) {
                this.complexEditingConfigs = complexEditingConfigs;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Inputs.
             */
            public Builder inputs(JobInputs inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MNSMessageResult.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(Long percent) {
                this.percent = percent;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * transcodeOutput.
             */
            public Builder transcodeOutput(TranscodeOutput transcodeOutput) {
                this.transcodeOutput = transcodeOutput;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    public static class JobList extends TeaModel {
        @NameInMap("Job")
        private java.util.List < Job> job;

        private JobList(Builder builder) {
            this.job = builder.job;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return job
         */
        public java.util.List < Job> getJob() {
            return this.job;
        }

        public static final class Builder {
            private java.util.List < Job> job; 

            /**
             * Job.
             */
            public Builder job(java.util.List < Job> job) {
                this.job = job;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
    public static class NonExistJobIds extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private NonExistJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistJobIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistJobIds build() {
                return new NonExistJobIds(this);
            } 

        } 

    }
}
